package com.mccoy.hellodemo;

import java.io.Serializable;

public class SimpleInterest implements Serializable
{
	
	int years;
	double principal_amount;
	double rate;
	
	public SimpleInterest() {
	}
	
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getPrincipal_amount() {
		return principal_amount;
	}
	public void setPrincipal_amount(double principal_amount) {
		this.principal_amount = principal_amount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void init()
	{
		System.out.println("bean is getting initialized");
	}
	
	public void destroy()
	{
		System.out.println("bean is getting destroyed");
	}
	
	

}
