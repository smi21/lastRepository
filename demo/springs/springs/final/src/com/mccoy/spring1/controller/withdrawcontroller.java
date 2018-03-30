package com.mccoy.spring1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.spring1.dao.DAO;
import com.mccoy.spring1.dto.Accbean;

@Controller
public class withdrawcontroller 
{
	
	public withdrawcontroller()
	{
		System.out.println(this.getClass().getSimpleName());
	}
	@Autowired
	private DAO dao;
	
	@RequestMapping(value="withdraw",method=RequestMethod.POST)
	public ModelAndView withdraw(Accbean accbean)
	{
        if(dao.isvalid(accbean))
        {
       dao.withdraw(accbean);
       return new ModelAndView("home","msg","withdraw successfull");
        }
        else
        {

		return new ModelAndView("home","msg","Invalid Account Numberwithdraw Unsuccessfull");
	
	}
	}
}
