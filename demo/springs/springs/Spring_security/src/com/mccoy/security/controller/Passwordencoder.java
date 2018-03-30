package com.mccoy.security.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passwordencoder 
{
	public void getpassword()
	{
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
	String result = encoder.encode("smita");
	System.out.println(result);
	//assertTrue(encoder.matches("myPassword", result));
	}
}
