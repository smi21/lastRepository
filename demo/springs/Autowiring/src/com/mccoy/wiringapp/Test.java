package com.mccoy.wiringapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
   
	public static void main(String[] args) 
	{
	System.out.println("main started");
	BeanFactory fac=new ClassPathXmlApplicationContext("beans.xml");
	Employee e=fac.getBean(Employee.class);
	System.out.println("Employee name "+e.getName());
	System.out.println("Adress details "+e.getAdress());
	System.out.println("main ended");
	}
}
