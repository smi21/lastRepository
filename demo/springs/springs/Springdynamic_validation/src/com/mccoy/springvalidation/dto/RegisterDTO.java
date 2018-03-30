package com.mccoy.springvalidation.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class RegisterDTO 
{
	
	private int id;
	@NotEmpty(message="Please enter Your Name!!")
	private String name;
	@Email(message="Improper email format")
	@NotEmpty(message="enter email")
	private String email;
	@Range(min = 18, message = "Not eligible..Age should be above 18")
	private int age;
	@DateTimeFormat(pattern="dd-MM-YY")
	private Date dob;
	@NotEmpty(message="please enter password")
	@Size(min=6)
	private String password;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}
	
	
}
