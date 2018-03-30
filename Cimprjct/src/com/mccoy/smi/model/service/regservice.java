package com.mccoy.smi.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mccoy.smi.dto.regdto;
import com.mccoy.smi.model.dao.regdao;

@Service
public class regservice {
	
	@Autowired
	private regdao dao;
	
public void create(regdto dto)
{
System.out.println("RegisteruserService method started");
	
	dao.save(dto);
	
	
	System.out.println("RegisteruserService method ended");	
}
}
