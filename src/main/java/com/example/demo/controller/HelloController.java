package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello World";
	}
	
	@RequestMapping("/greet")
	@ResponseBody
	public String greet(@RequestParam String name) {
		return "Hello " + name;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String greet(@RequestParam String operand1, @RequestParam String operand2) {
		int x = Integer.parseInt(operand1);
		int y = Integer.parseInt(operand2);
		return "" + operand1 + " + " + operand2 + " = " + (x + y);
	}
	
}