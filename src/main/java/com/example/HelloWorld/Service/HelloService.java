package com.example.HelloWorld.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String greeting() {
		return "Hello World!";
	}
}
