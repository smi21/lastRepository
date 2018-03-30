package com.mccoy;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/pojo")
public class LoginControler {
	public LoginControler() 
	{
		System.out.println(this.getClass().getSimpleName());
	}
	
	@RequestMapping(value ="/showForm") 
	public String displayLogin(Model model) 
	{ 
		model.addAttribute("pojo",new Pojo());
		return "login"; 
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView loginData(@Valid @ModelAttribute("pojo")Pojo pojo,BindingResult res,ModelMap model)
	{
	System.out.println(pojo.getName());
		System.out.println(pojo.getPassword());
		
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
			return new ModelAndView("login");
	      } else 
	      {
	          return new ModelAndView("home");
	      }
		
		
		
		
	}
	
}
