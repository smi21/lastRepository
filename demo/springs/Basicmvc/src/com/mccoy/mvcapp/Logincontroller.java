package com.mccoy.mvcapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class Logincontroller
{
   @RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(@RequestParam("username")String uname,@RequestParam("password")String pass)
	{
		System.out.println("login started");
		
		/*String uname=req.getParameter("username");
		String pass=req.getParameter("password");
		System.out.println(uname);
		System.out.println(pass);*/
	if(uname.equals("shalini")&&(pass.equals("shalini")))
		{
		System.out.println("login successful");
		return new ModelAndView("/home");
	     }
		else
		{
		return new ModelAndView("/login","msg","login failed");
		
	}
	}
}
		
	