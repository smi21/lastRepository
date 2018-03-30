package com.mccoy.spring1.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidat implements ConstraintValidator<ValidEmail, String>
{

@Override
	public void initialize(ValidEmail constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}	

	
	
	@Override
	public boolean isValid(String email, ConstraintValidatorContext arg1) 
	{
		boolean val;
		
		if(email!=null)
		{
		//val= (email.endsWith("gmail.com"))||(email.endsWith("yahoo.com"));
		val=(email.matches("[a-zA-Z0-9_]+@gmail.com"))|(email.matches("[a-zA-Z0-9_]+@yahoo.com"));
		}
		else
		{
			val=true;
		}
		
		return val;
	}
	
}
