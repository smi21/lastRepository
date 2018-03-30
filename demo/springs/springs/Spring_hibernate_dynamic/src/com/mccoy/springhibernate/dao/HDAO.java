package com.mccoy.springhibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mccoy.springhibernate.dto.Accountdto;
import com.mccoy.springhibernate.dto.Logindto;
import com.mccoy.springhibernate.dto.Registerdto;

@Repository
public class HDAO 
{
	@Autowired
	private SessionFactory fac;

	public SessionFactory getFac() {
		return fac;
	}

	public void save(Object dto)
	{

		System.out.println("save started");
		Session session=fac.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		System.out.println("begin transaction");
		try
		{
			session.save(dto);
			tr.commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			//fac.close();
		}
		System.out.println("save ended");


	}


	public boolean validate(Logindto ldto)
	{
		Session session=fac.openSession();
		String s="select r from Registerdto r where r.name=:name and r.password=:password";
		Query q=session.createQuery(s);
		q.setParameter("name",ldto.getName());
		q.setParameter("password",ldto.getPassword());
		Registerdto r=(Registerdto) q.uniqueResult();
		if(r!=null)
		{
			System.out.println(r);

			session.close();
			return true;
		}
		return false;


	}

	public void update(Accountdto adto) 
	{
		System.out.println("update started");
		Session session=fac.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		System.out.println(adto.getAccno());
		Accountdto a=(Accountdto) session.byId(Accountdto.class).load(adto.getAccno());
		//Accountdto a=session.get(Accountdto.class,adto.getAid());
		System.out.println(a);
		int am=(int) (a.getAmount()+adto.getAmount());
		a.setAmount(am);
		tr.commit();
		session.close();
	
		
	}

	public  int check(Accountdto adto) 
	{
		
		Session session=fac.openSession();
		Accountdto a=(Accountdto) session.byId(Accountdto.class).load(adto.getAccno());
		int amount=(int) a.getAmount();
		return amount;
		
		
	}

	public void withdraw(Accountdto adto) {
		Session session=fac.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		System.out.println(adto.getAccno());
		Accountdto a=(Accountdto) session.byId(Accountdto.class).load(adto.getAccno());
		//Accountdto a=session.get(Accountdto.class,adto.getAid());
		System.out.println(a);
		int am=(int) (a.getAmount()-adto.getAmount());
		a.setAmount(am);
		tr.commit();
		session.close();
		
	}

}
