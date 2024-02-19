package com.webdev.todo.sayhello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHello {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String displayHello() {
		return "HELLO! What are you learning today?";
	}
	
	@RequestMapping("say-hello-jsp")
	public String displayHelloJsp() {
		return "sayHello";
	}
}
