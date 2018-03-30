package com.mccoy.spring1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.spring1.dao.DAO;
import com.mccoy.spring1.dto.Accbean;

@Controller
public class checkcontroller 
{
	@Autowired
	private DAO dao;
	
	public checkcontroller() {
		
		System.out.println(this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}

	
	@RequestMapping(value="check",method=RequestMethod.POST)
	public ModelAndView check(Accbean accbean)
	{
		if(dao.isvalid(accbean))
		{
	int amount=dao.check(accbean);	
	return new ModelAndView("home","msg", "Your account balance is "+amount);
		}
		else
		{
			return new ModelAndView("home","msg", "Invalid Acount Number");
		}
	}
}
