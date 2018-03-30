package com.mccoy.beannamviewresolver;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
@Component
public class myView implements View 
{

	@Override
	public String getContentType() {
		return "text/html";
				}

	@Override
	public void render(Map<String, ?> arg0, HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// TODO Auto-generated method stub
		 response.setContentType(getContentType());
	      PrintWriter writer = response.getWriter();
	      writer.println("This is my view.<br/>");
		
	}

}
