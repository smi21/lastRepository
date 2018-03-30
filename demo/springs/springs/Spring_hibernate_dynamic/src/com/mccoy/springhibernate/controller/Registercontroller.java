package com.mccoy.springhibernate.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.springhibernate.dao.HDAO;
import com.mccoy.springhibernate.dto.Registerdto;

@Controller
@RequestMapping("/rdto")
public class Registercontroller
{
	
	@Autowired
	private HDAO dao;
	
	
	
	
	
	
	
	
	
	public Registercontroller() 
	{
		System.out.println(this.getClass().getSimpleName());
	}
	

@RequestMapping(value="register",method=RequestMethod.POST)
public ModelAndView register(@ModelAttribute("rdto") Registerdto rdto,BindingResult res)
{
	System.out.println("regsiter method............");
	
	 /* if (res.hasErrors()) {
          return new ModelAndView("register.jsp");
      } else {
          return new ModelAndView("login.jsp");
      }*/
	
	
	
	System.out.println(rdto.getName());
	System.out.println("register controller method");
	dao.save(rdto);
	return new ModelAndView("login.jsp");
}
	
}
