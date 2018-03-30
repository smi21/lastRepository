package com.mccoy.spring1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.spring1.dao.DAO;
import com.mccoy.spring1.dto.Loginbean;
import com.mccoy.spring1.dto.Regbean;

@Controller
public class Logincontroller 
{

	public Logincontroller() {
		System.out.println(this.getClass().getSimpleName());

	}
	@Autowired
	private DAO dao;

	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(Loginbean loginbean,HttpServletRequest req)
	{
		System.out.println("login started");
		System.out.println(loginbean.getName());
		Regbean r=dao.validate(loginbean);
		if(r!=null)
		{
			HttpSession hsession=req.getSession(true);
			hsession.setAttribute("dto",r);
			return new ModelAndView("/home");
		}
		else
		{
			return new ModelAndView("/login","msg","Login Failed..!!");
		}
	}

}
