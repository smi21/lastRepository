package com.mccoy.map.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.mccoy.map.dto.EmployeeDTO;
import com.mccoy.map.mappers.EmployeeMapper;
import com.mccoy.map.service.Myservice;

public class DAO 
{

Myservice s=new Myservice();
	
	public void save(EmployeeDTO e) throws IOException
	{
		System.out.println("save started");
		SqlSession session = s.getSessionfactory().openSession();
		System.out.println("open session");
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		System.out.println("get mapper");
		mapper.insert(e);
		session.commit();
		session.close();
		System.out.println("save ended");

	}
	
}
