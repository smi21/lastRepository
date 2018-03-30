package com.mccoy.springhibernate.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="just")
public class Registerdto implements Serializable
{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private Date dob;

	@Column(name="age")
	private int age;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public Registerdto() 
	{
		System.out.println(this.getClass().getSimpleName());
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


}
