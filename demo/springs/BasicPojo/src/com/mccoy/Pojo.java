package com.mccoy;


import java.io.Serializable;


import org.hibernate.validator.constraints.NotEmpty;

public class Pojo
{
@NotEmpty(message="please enter name..!!")
private String name;

private String password;

public Pojo() {
	System.out.println("pojo started");
}


public Pojo(String name, String password) {
	super();
	this.name = name;
	this.password = password;
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
