package com.webdev.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	private AuthService authentication;
	public loginController(AuthService authentication) {
		super();
		this.authentication = authentication;
	}

	@RequestMapping(value="login",method = RequestMethod.GET)
	public String LoginPage() {
		return "login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String WelcomePage(@RequestParam String username ,@RequestParam String password) {
		//credentials
		//username = sambhav
		//password = 1234
		if(authentication.authenticate(username, password)) {
			return "welcome";
		}
		return "login";
	}
}
