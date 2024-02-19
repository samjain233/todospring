package com.webdev.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	@RequestMapping("login")
	public String LoginPage(@RequestParam String name , ModelMap model) {
		model.put("name", name);
		return "login";
	}
}
