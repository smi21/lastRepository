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
public class Checkcontroller 
{
	@Autowired
	private HDAO dao;
	public Checkcontroller() {
System.out.println(this.getClass().getSimpleName());

	}
	@RequestMapping(value="check",method=RequestMethod.POST)
	public ModelAndView check(Accountdto adto)
	{
	int amount=dao.check(adto);	
	return new ModelAndView("home.jsp","msg", "Your account balance is "+amount);
	}
	

}
