package com.mccoy.springhibernate.dto;

import java.io.Serializable;

public class Logindto implements Serializable
{
	
	String name;
	String password;
	public Logindto() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
