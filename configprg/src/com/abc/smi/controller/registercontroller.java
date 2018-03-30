package com.abc.smi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.abc.smi.dto.registerdto;
import com.abc.smi.service.registerservice;

@Controller
@RequestMapping("/")
public class registercontroller {
	
	public registercontroller() {
System.out.println("registercontroller def const");
	}
	
	@Autowired
	private registerservice service;
	
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public ModelAndView view(registerdto dto)
	{
		service.create(dto);
		ModelAndView modelAndView = new ModelAndView("/register.jsp");
		//modelAndView.addObject("successMsg", "Register success!!:" + dto.getDept() + " " + dto.getId()+" "+dto.getLoc()+ " "+dto.getName());
		return modelAndView;
	}
}
