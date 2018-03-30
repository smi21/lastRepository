package com.mccoy.spring1.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mccoy.spring1.dto.Accbean;
import com.mccoy.spring1.dto.Loginbean;
import com.mccoy.spring1.dto.Regbean;

@Repository
public class DAO {
	
	
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

	public Regbean validate(Loginbean loginbean) 
	{
		
		Session session=fac.openSession();
		String s="select r from Regbean r where r.name=:name and r.password=:password";
		Query q=session.createQuery(s);
		q.setParameter("name",loginbean.getName());
		q.setParameter("password",loginbean.getPassword());
		Regbean r=(Regbean) q.uniqueResult();
		if(r!=null)
		{
			System.out.println(r);

			session.close();
			
		}
		
		return r;
	}

	public void deposit(Accbean accbean) 
	{
		
		System.out.println("update started");
		Session session=fac.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		System.out.println(accbean.getAccno());
		Accbean a=(Accbean) session.byId(Accbean.class).load(accbean.getAccno());
		System.out.println(a);
		int am=(int) (a.getAmount()+accbean.getAmount());
		a.setAmount(am);
		tr.commit();
		session.close();
		
	}
	public void withdraw(Accbean accbean) 
	{
		
		System.out.println("update started");
		Session session=fac.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		System.out.println(accbean.getAccno());
		Accbean a=(Accbean) session.byId(Accbean.class).load(accbean.getAccno());
		System.out.println(a);
		int am=(int) (a.getAmount()-accbean.getAmount());
		a.setAmount(am);
		tr.commit();
		session.close();
		
	}

	public int check(Accbean accbean) {
		Session session=fac.openSession();
		Accbean a=(Accbean) session.byId(Accbean.class).load(accbean.getAccno());
		int amount=(int) a.getAmount();
		return amount;
	}  
	public boolean exists(Accbean accbean)
	{
		System.out.println("is exists started");
		System.out.println(accbean.getId());
		Session session=fac.openSession();
		String s="select a from Accbean a where a.id=:id";
		Query q=session.createQuery(s);
		q.setParameter("id",accbean.getId());
		Accbean a=(Accbean) q.uniqueResult();
		if(a!=null)
		{
			System.out.println(a);

			session.close();
			return true;
		}
		
		return false;
	
	}
	public boolean isvalid(Accbean accbean)
	{
		System.out.println("is valid started");
		System.out.println(accbean.getId());
		Session session=fac.openSession();
		String s="select a from Accbean a where a.accno=:accno";
		Query q=session.createQuery(s);
		q.setParameter("accno",accbean.getAccno());
		Accbean a=(Accbean) q.uniqueResult();
		if(a!=null)
		{
			System.out.println(a);

			session.close();
			return true;
		}
		
		return false;
		
	}
	
}
