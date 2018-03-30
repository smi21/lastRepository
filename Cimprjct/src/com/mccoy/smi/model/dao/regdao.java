package com.mccoy.smi.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mccoy.smi.dto.regdto;

@Repository
public class regdao {
	@Autowired
	private SessionFactory factory;
	public void save(regdto dto)
	{
		System.out.println("save method started");
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		
		System.out.println("save method ended");
	}

}
