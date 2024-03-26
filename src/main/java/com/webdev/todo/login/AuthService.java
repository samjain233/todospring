package com.webdev.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
	
	public boolean authenticate(String username , String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("sambhav");
		boolean isValidPassword = password.equals("1234");
		
		return isValidUsername && isValidPassword;
	}
}
