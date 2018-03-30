package com.abc.smi.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.smi.dto.registerdto;

@Repository
public class registerdao {
	
	@Autowired
	private SessionFactory factory;
	public registerdao() {
		// TODO Auto-generated constructor stub
		System.out.println("registerdao con");
	}
	public void save(registerdto dto) {
		
		
		System.out.println("save method started");
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try{
		session.save(dto);
		tx.commit();
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			tx.rollback();
		} finally
		{
		session.close();
		}
	}


}
