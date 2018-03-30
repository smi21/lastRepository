package com.mccoy.spring1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.spring1.dao.DAO;
import com.mccoy.spring1.dto.Regbean;

@Controller
@RequestMapping("/")
public class Regcontroller 
{
	public Regcontroller() {
		System.out.println(this.getClass().getSimpleName());
	}
	@RequestMapping(value ="showForm",method=RequestMethod.GET) 
	public String displayRegister(Model model) 
	{ 
		model.addAttribute("regbean",new Regbean());
		return "register"; 
	}
	@Autowired
	private DAO dao;


	@RequestMapping(value="register",method=RequestMethod.POST)
	public ModelAndView register(@Valid @ModelAttribute("regbean")Regbean regbean,BindingResult res)
	{
		if (res.hasErrors())
		{
			System.out.println(res);
			return new ModelAndView("register");
		} else 
		{
			dao.save(regbean);
			return new ModelAndView("login");
		}


	}
}
