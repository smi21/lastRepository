package com.mccoy.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mccoy.jdbc.dto.Accountdto;
import com.mccoy.jdbc.dto.Logindto;
import com.mccoy.jdbc.dto.Registerdto;

@Repository
public class DAO 
{
	@Autowired
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public String save(Registerdto rdto)
	{
		System.out.println("save started");
		//System.out.println(rdto.getId());
		//int id=rdto.getId();
	//	String namw=rdto.getName();
		jdbctemplate.update("insert into spring_jdbc values('"+rdto.getId()+"','"+rdto.getName()+"','"+rdto.getEmailid()+"','"+rdto.getPassword()+"')");
		
		System.out.println("data inserted successfully");
		return "inserted";
		
	}

	public boolean saveaccount(Accountdto adto) 
	{
		System.out.println("saving account details started");
		{
			//String sql="insert into spring_jdbc_child values('"+adto.getAid()+"','"+adto.getAccno()+"','"+adto.getAmount()+"'";
			jdbctemplate.update("insert into spring_jdbc_child values('"+adto.getAid()+"','"+adto.getAccno()+"','"+adto.getAmount()+"')");
			return true;
		}
		
		
	}

	public boolean validate(Logindto ldto) 
	{
		System.out.println("validation started");
		String name=ldto.getName();
		System.out.println(ldto.getName());
		ldto.getPassword();
		String sql="select password from spring_jdbc where name=?";
		try
		{
				 String r = (String) jdbctemplate.queryForObject(sql, new Object[]{ldto.getName()},String.class);
				// jdbctemplate.query(sql,ldto.getName(),)
				 
		}catch(DataAccessException e)
		{
			System.out.println("no rows fetched");
			return false;
		}
				 /*System.out.println("password= "+r);
				    System.out.println(r);
				    if(r!=null)
				    {
				    return true;
				    }
				    return false;*/
		return true;
	}

	public boolean deposit(Accountdto adto) 
	{
		System.out.println("deposit started");
		System.out.println(adto.getAid());
		System.out.println(adto.getAmount());
		jdbctemplate.update("update spring_jdbc_child set amount=amount+'"+adto.getAmount()+"'where aid=+'"+adto.getAid()+"'");
		System.out.println("deposited");
		
		return true;
	}

	public int check(Accountdto adto) {
		
		int r=0;
		System.out.println("check balance method");
		String sql="select amount from spring_jdbc_child where aid=?";
		try
		{
				 r = (int) jdbctemplate.queryForObject(sql, new Object[]{adto.getAid()},Integer.class);
				// jdbctemplate.query(sql,ldto.getName(),)
				 System.out.println(r);
				 
		}catch(DataAccessException e)
		{
			System.out.println("no rows fetched");
			//return false;
		}
		
		
		return r;
		
	}
	
	

}
