package com.mccoy.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mccoy.jdbc.dao.DAO;
import com.mccoy.jdbc.dto.Accountdto;

@Controller
public class checkbalancecontroller {
	
	@Autowired
	private DAO dao;
	public checkbalancecontroller() {
    System.out.println("checkbalance def constr");
}
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public ModelAndView check(Accountdto adto)
	{
		
		int i=dao.check(adto);
		return new ModelAndView("index-2.jsp","msg",i);
		
	}
	
	
	
}
