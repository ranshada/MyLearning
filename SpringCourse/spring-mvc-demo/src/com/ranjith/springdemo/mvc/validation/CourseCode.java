package com.ranjith.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	
	//define default value
	public String value()  default "LUV";
		
	//default error message
	public String message() default "Must start with LUV";
	
	//defune default groups
	
	public Class<?>[] groups() default{};
 	//define default payloads
public Class<? extends Payload>[] payload() default {};
}
