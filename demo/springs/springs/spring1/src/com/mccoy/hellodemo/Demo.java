package com.mccoy.hellodemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{
	public static void main(String[] args) 
	{
		
		System.out.println("main started");
		BeanFactory fac=new ClassPathXmlApplicationContext("beans.xml");
		SimpleInterest s=(SimpleInterest)fac.getBean(SimpleInterest.class);
		double si=s.getPrincipal_amount()*s.getYears()*s.getRate()/100;
		System.out.println("simple Interest= "+si);
	
		/*CompundInterest c=fac.getBean(CompundInterest.class);
		double compoundInterest = c.principal_amount * Math.pow((1 +c.rate/100),c.years);
		System.out.println("compund Interest= "+compoundInterest);*/
		System.out.println("main ended");

	}
}
