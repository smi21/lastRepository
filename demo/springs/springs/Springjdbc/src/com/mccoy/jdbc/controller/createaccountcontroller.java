package com.mccoy.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.jdbc.dao.DAO;
import com.mccoy.jdbc.dto.Accountdto;
@Controller
@RequestMapping("/")
public class createaccountcontroller 
{
	@Autowired
	private DAO dao;
	
	
    @RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView createaccount(Accountdto adto)
	{
	System.out.println("create account method");
    	adto.setAccno(1001);
    	boolean t=dao.saveaccount(adto);
    	if(t){
    		return new ModelAndView("/index-2.jsp");
    	}
		return new ModelAndView("/create_account.jsp");
    	
	}}
	
	
	

