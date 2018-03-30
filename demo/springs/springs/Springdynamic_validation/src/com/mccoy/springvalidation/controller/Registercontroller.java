package com.mccoy.springvalidation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.springvalidation.dto.RegisterDTO;

@Component
@RequestMapping("/registerdto")
public class Registercontroller 
{
	public Registercontroller() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@RequestMapping(value ="/showForm") 
	public String displayRegister(Model model) 
	{ 
		model.addAttribute("registerdto",new RegisterDTO());
		return "register"; 
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView RegisterData(@Valid @ModelAttribute("registerdto")RegisterDTO registerdto,BindingResult res,ModelMap model)
	{
	System.out.println(registerdto.getName());
		System.out.println(registerdto.getPassword());
		
		/*if(pojo.getName().equals("shalini") && (pojo.getPassword().equals("shalini")))
		{
			return new ModelAndView("/home");
		}
		else
		{
			return new ModelAndView("/login","msg","Invalid details");
		}*/
		
		//model.addAttribute("pojo",new Pojo());
		
		 if (res.hasErrors())
		 {
			 System.out.println(res);
			return new ModelAndView("register");
	      } else 
	      {
	          return new ModelAndView("home");
	      }
		
	}
}

	
