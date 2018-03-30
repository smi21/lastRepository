package com.mccoy.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.jdbc.dao.DAO;
import com.mccoy.jdbc.dto.Logindto;
import com.mccoy.jdbc.dto.Registerdto;
@Controller
@RequestMapping("/")
public class Logincontroller 
{
	@Autowired
	private DAO dao;
	
	public Logincontroller() {
		System.out.println("login controller defconst");
	}
	
   @RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(Logindto ldto)
	{
	   System.out.println("login started");
	   System.out.println(ldto.getName());
		
		boolean r=dao.validate(ldto);
		if(r)
		{
			return new ModelAndView("/index-2.jsp");
		}
		
		return new ModelAndView("/login.jsp");
	}
	
	
	
}
