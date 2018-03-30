package com.mccoy.jdbc.dto;

import java.io.Serializable;

public class Registerdto implements Serializable
{
	private int id;
	private String name;
	private String emailid;
	private String password;
	public Registerdto() {
		System.out.println("regdto def constructer");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
