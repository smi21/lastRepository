package com.mccoy.spring1.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.mccoy.spring1.custom.ValidEmail;

@Entity
@Table(name="final")
public class Regbean implements Serializable
{
	//LocalDate dob=LocalDate.now();

	@Id
	@GenericGenerator(name="myid1",strategy="increment")
	@GeneratedValue(generator="myid1")
	@Column(name="id")
	int id;
	@NotEmpty(message="name cannot be empty")
	@Pattern(regexp="[a-z-A-Z]*",message="Enter only Alphabets")
	@Column(name="name")
	private String name;
	@NotEmpty(message="Email cannot be empty")
	@ValidEmail
	@Column(name="email")
	private String email;
	@NotNull(message="please enter Age")
	@Min(value = 18, message = "Not eligible..Age must be above 18")
	@Max(value=100,message="Age must be less than 100")
	@Column(name="age")
	private int age;
	/*public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}*/

	@NotNull(message="please enter Date")
	@DateTimeFormat(pattern="dd-MM-YYYY")
	@Temporal(TemporalType.DATE)
	@Column(name="dob")
	private Date dob;

	@NotEmpty(message="Password cannot be empty")
	@Size(min=6,message="minimum 6 characters")
	@Column(name="password")
	private String password;


	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	


}
