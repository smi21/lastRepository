package com.mccoy.spring1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.spring1.dao.DAO;
import com.mccoy.spring1.dto.Accbean;

@Controller
public class createcontroller 
{
	@Autowired
	private DAO dao;
public createcontroller() 
{
	System.out.println(this.getClass().getName());
	
}
	
@RequestMapping(value="create",method=RequestMethod.POST)
public ModelAndView create(Accbean accbean)
{
	System.out.println(accbean.getId());
	System.out.println(accbean.getAccno());
	if(dao.exists(accbean)==true)
	{
		return new ModelAndView("home","msg","Account for the entered ID already exists");	
	}
	else
	{
	dao.save(accbean);
	return new ModelAndView("home","msg","Account created successfully..your Account number is "+accbean.getAccno());
	}
	
}
	
}
