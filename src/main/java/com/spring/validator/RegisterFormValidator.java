package com.spring.validator;

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.model.User;

@Component
public class RegisterFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> classTest) {
		return User.class.equals(classTest);
	}

	@Override
	public void validate(Object obj, Errors err) {
		ValidationUtils.rejectIfEmpty(err, "name", "Empty.user.name");
		ValidationUtils.rejectIfEmpty(err, "password", "Empty.user.password");
		
		User usr = (User) obj;
		
		System.out.println("USER OBJECT = " + usr);
		
		if(usr != null && usr.getName().length() < 5) {
			err.rejectValue("name", "Size.user.name");
		}
		if(usr != null && usr.getPassword().length() < 5) {
			err.rejectValue("password", "Size.user.password");
		}
		if(usr != null && usr.getCity().length() < 5) {
			err.rejectValue("city", "Size.user.city");
		}
	}
}
