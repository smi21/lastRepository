package com.mccoy.spring1.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy=EmailValidat.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
	
	String message() default "Invalid Email format..!!";

	  Class<?>[] groups() default {};

	  Class<? extends Payload>[] payload() default {};

}
