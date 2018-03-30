package com.mccoy.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("bank")
public class Clientservlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{

      double pa=Double.parseDouble(req.getParameter("pa"));
      int time=Integer.parseInt(req.getParameter("time"));
      
      int rate=0;
      
      double si=(pa*time*rate)/100;
      System.out.println("si "+si);

}

}
