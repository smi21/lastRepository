package com.mccoy.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.springhibernate.dao.HDAO;
import com.mccoy.springhibernate.dto.Accountdto;

@Controller
@RequestMapping("/")
public class Depositcontroller {

	@Autowired
	private HDAO dao;
	public Depositcontroller() {
		System.out.println(this.getClass().getSimpleName());
	}
/*	@RequestMapping(value="deposit",method=RequestMethod.POST)
	public ModelAndView deposit(@RequestParam("aid")int aid,@RequestParam("amount")double amount)
	{
        
       dao.update(aid,amount);


		return new ModelAndView("home.jsp","msg","Deposited successfully");
	
	}*/
	@RequestMapping(value="deposit",method=RequestMethod.POST)
	public ModelAndView deposit(Accountdto adto)
	{
        
       dao.update(adto);


		return new ModelAndView("home.jsp","msg","Deposited successfully");
	
	}
	}