package com.mccoy.beannamviewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class Democontroller 
{
	public Democontroller() {
		System.out.println(this.getClass().getSimpleName());
	}	
	@RequestMapping(value="/demo",method=RequestMethod.POST)
	public ModelAndView demo()
	{
		System.out.println("entering demo contrtolers");
		return new ModelAndView("myView");
		
	}
}
