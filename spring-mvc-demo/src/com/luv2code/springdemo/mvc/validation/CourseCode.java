package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

<<<<<<< HEAD
	// Adding comment for test56
	// Adding changes using git bash
=======
	// Adding comment for test
	// Adding comment for learnpushchild
>>>>>>> 4579f2c5bc0697279f20ed4a8d4ce25b27cf8c19
	
	//define default course code
	public String value() default "LUV";
	// define default error message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
	}
