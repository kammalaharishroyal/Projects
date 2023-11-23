package com.harish.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

//import com.harish.registrationlogin.dto.UserRegistrationDto;
import com.harish.registrationlogin.model.User;
import com.harish.registrationlogin.web.dto.UserRegistrationDto;



@Component
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}