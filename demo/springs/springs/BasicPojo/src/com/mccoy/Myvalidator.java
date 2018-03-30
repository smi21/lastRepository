package com.mccoy;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class Myvalidator implements Validator{

	@Override
	public boolean supports(Class candidate) 
	{
		// TODO Auto-generated method stub
		return(Pojo.class.isAssignableFrom(candidate));
	}

	@Override
	public void validate(Object object, Errors errors) 
	{
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.Pojo.name", "Field is required.");
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.Pojo.password", "Field is required.");
    }	
		
		
}

