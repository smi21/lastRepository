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
public class Depositcontroller 
{
	@Autowired
	private DAO dao;
	public Depositcontroller() {
		System.out.println(this.getClass().getSimpleName());
	}
	@RequestMapping(value="deposit",method=RequestMethod.POST)
	public ModelAndView deposit(Accountdto adto)
	{
		if(dao.deposit(adto))
		{
			return new ModelAndView("index-2.jsp");
		}
		return new ModelAndView("deposit.jsp");
	}
	

}
