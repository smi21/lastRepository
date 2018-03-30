package com.mccoy.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.springhibernate.dao.HDAO;
import com.mccoy.springhibernate.dto.Accountdto;

@Controller
public class Withdrawcontroller 
{
	@Autowired
	private HDAO dao;

	public Withdrawcontroller() {
		System.out.println(this.getClass().getSimpleName());	

}
@RequestMapping(value="withdraw",method=RequestMethod.POST)	
public ModelAndView withdraw(Accountdto adto)	
{
	
	dao.withdraw(adto);
	return new ModelAndView("home.jsp","msg","Withdraw successful");
	
}
}