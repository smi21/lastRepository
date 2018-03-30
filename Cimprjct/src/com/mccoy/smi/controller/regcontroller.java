package com.mccoy.smi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.smi.dto.regdto;
import com.mccoy.smi.model.service.regservice;

@Controller
@RequestMapping("/")
public class regcontroller {
	
	@Autowired
	private regservice service;
	
	public regcontroller() {
		System.out.println("regcontroller created.........");
	}
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public ModelAndView view(regdto dto) {
		System.out.println("modelandview() is calling.....");
		
		 service.create(dto);
		local

		ModelAndView modelAndView = new ModelAndView("/register.jsp");
		modelAndView.addObject("successMsg", "Register success!!:" + dto.getEmpid() + " " + dto.getEmpname()+" "+dto.getEmpdept()+ " "+dto.getEmploc());
		return modelAndView;

	}
	
}
