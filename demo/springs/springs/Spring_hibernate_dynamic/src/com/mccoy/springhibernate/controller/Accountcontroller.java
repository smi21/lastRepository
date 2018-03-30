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
public class Accountcontroller 
{
	@Autowired
	private HDAO dao;
	
	public Accountcontroller() {
		System.out.println(this.getClass().getSimpleName());
	}
   @RequestMapping(value="create",method=RequestMethod.POST)
	public ModelAndView create(Accountdto adto)
	{
		dao.save(adto);
		return new ModelAndView("home.jsp","msg","Account created successfully..your Account number is "+adto.getAccno());
		
	}
}
