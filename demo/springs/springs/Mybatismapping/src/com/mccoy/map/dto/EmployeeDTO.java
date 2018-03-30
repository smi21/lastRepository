package com.mccoy.map.dto;

import java.util.ArrayList;

public class EmployeeDTO 
{
	
	int id;
	String name;
	String email;
	String dept;
	String password;
	
	
	
	private ArrayList<AdressDTO> adto;
	
	public ArrayList<AdressDTO> getAdto() {
		return adto;
	}


	public void setAdto(ArrayList<AdressDTO> adto) {
		this.adto = adto;
	}


	public EmployeeDTO() {
		System.out.println("employee constructor");
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
