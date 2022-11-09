package com.example.HelloWorld.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HelloWorld.Service.HelloService;

@RestController
@RequestMapping("/hello/")
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@GetMapping("greet")
	public String getGreeting() {
		return helloService.greeting();
	}
}


