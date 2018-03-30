package com.mccoy.map.service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Myservice 
{
	public SqlSessionFactory getSessionfactory() throws IOException
	{
		
		SqlSessionFactory sqlSessionFactory=null;
		Reader reader = Resources.getResourceAsReader("config.xml");
		System.out.println(" config file loaded");
		try{
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("build");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return sqlSessionFactory;
	}
}
