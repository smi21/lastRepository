package com.mccoy.spring1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class logoutcontroller 
{
	@RequestMapping(value="logout")
	public ModelAndView logout(HttpServletRequest req)
	{
		req.getSession().invalidate();
		
		return new ModelAndView("login","msg1","Logout successful");
	
	}

}
