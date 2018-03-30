package com.mccoy.providers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBservice 
{
	public Session getService()
	{
		Configuration con=new Configuration();
		con.configure();
		System.out.println("configured");
		SessionFactory fac=con.buildSessionFactory();
		System.out.println("build session factoty");
		Session session=fac.openSession();
		System.out.println("open session");
		return session;
	}

}
