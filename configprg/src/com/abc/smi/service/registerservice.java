package com.abc.smi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.smi.dao.registerdao;
import com.abc.smi.dto.registerdto;
@Service
public class registerservice {
	
	@Autowired
	private registerdao dao;
	
	public registerservice() {
		// TODO Auto-generated constructor stub
		System.out.println("registerservice con");
	}

	public void create(registerdto dto) 
	{
		
	System.out.println("create method started");
	dao.save(dto);
	
	System.out.println("ended");
		
	}
	

}
