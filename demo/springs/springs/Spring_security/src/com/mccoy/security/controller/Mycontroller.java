package com.mccoy.security.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class Mycontroller 
{

	@RequestMapping(value="/", method=RequestMethod.GET)  
	public String home() {  
		return "home";  
	}  

	@RequestMapping(value="/admin", method=RequestMethod.GET)  
	public String privateHome() 
	{  
		return "admin";  
	} 
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() 
	{

		ModelAndView model = new ModelAndView();


		model.addObject("msg","You do not have permission to access this page..!!");

		model.setViewName("403");
		return model;

	}
	@RequestMapping(value="/user", method=RequestMethod.GET)  
	public String  user(HttpServletRequest req,HttpServletResponse resp)
	{  
		
		System.out.println("user controller");
		//return new ModelAndView("redirect:http://localhost:8050/final/");
		//httpServletResponse.sendRedirect("https://twitter.com");
		System.out.println(req);
		HttpSession s=req.getSession();
		s.setAttribute("name", req.getParameter("username"));
		s.setAttribute("password", req.getParameter("password"));
		
		return "user";
		
	} 
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public ModelAndView test()
	{
	System.out.println("entered delete controller");
	ModelAndView model = new ModelAndView();
	model.addObject("msg","Account deleted");
	model.setViewName("user");
	return model;
	}
	
	
	
	
	
}
