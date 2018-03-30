package com.mccoy.map.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mccoy.map.dao.DAO;
import com.mccoy.map.dto.AdressDTO;
import com.mccoy.map.dto.EmployeeDTO;
@WebServlet("/reg")
public class RegisterController extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("nm");
		String email=req.getParameter("em");
		String dept=req.getParameter("dp");
		String password=req.getParameter("pd");
		
		DAO d=new DAO();
		//AdressDTO adto=new AdressDTO(aid, street_name)
		//EmployeeDTO e=new EmployeeDTO(id, name, email, dept, password, adto)
		//d.save(e);
		
		RequestDispatcher rd=req.getRequestDispatcher("/login.jsp"); 
		rd.include(req, resp);
		
		
		
		
	}
	
	
}
