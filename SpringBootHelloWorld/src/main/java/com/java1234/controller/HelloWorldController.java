package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorld")
	@ResponseBody
	public String sayHelloWorld() {
		return "hello world Spring boot 哈哈";
	}
}
