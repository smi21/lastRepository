package com.mccoy.spring1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.spring1.dao.DAO;
import com.mccoy.spring1.dto.Accbean;

@Controller
public class depositcontroller
{
	
	public depositcontroller() 
	{
		System.out.println(this.getClass().getSimpleName());
		
	}
	@Autowired
	private DAO dao;
	
	@RequestMapping(value="deposit",method=RequestMethod.POST)
	public ModelAndView deposit(Accbean accbean)
	{
        if(dao.isvalid(accbean))

        	{
        	dao.deposit(accbean);
        	return new ModelAndView("home","msg","Deposited successfully");
        	}

        else
        {
		return new ModelAndView("home","msg","Invalid Account number.Deposit unsuccessful");
	
	}
	}
	
	

}
