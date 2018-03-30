package com.mccoy.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.springhibernate.dao.HDAO;
import com.mccoy.springhibernate.dto.Logindto;
import com.mccoy.springhibernate.dto.Registerdto;

@Controller
@RequestMapping("/")
public class Logincontroller 
{
	@Autowired
	private HDAO dao;
	
	public Logincontroller() {
    System.out.println(this.getClass().getSimpleName());
	}
    @RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(Logindto ldto)
	{
	System.out.println("login started");
	System.out.println(ldto.getName());
	if(dao.validate(ldto))
	{
		return new ModelAndView("/home.jsp");
	}
	else
	{
		return new ModelAndView("/login.jsp","msg","Login Failed..!!");
	}
}
}
