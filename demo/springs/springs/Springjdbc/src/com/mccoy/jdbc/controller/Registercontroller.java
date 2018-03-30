package com.mccoy.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.jdbc.dao.DAO;
import com.mccoy.jdbc.dto.Registerdto;

@Controller
@RequestMapping("/")
public class Registercontroller 
{
	
	public Registercontroller() {
		System.out.println("register controller");
	}
	
	@Autowired
	private DAO dao;
	@RequestMapping(value="/register",method=RequestMethod.POST)
   public ModelAndView register(Registerdto rdto)
   {
	   
	   System.out.println("register controller started");
	   System.out.println(rdto.getName());
	   String msg=dao.save(rdto);
	   System.out.println(msg);
	return new ModelAndView("/index-2.jsp");
	   
   }
	
	
	
}
