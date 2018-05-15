package com.example.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello(){
		return "Hello Spring Boot!!";
	}
	
	@RequestMapping("/sayMe")
	public String sayMe(String arg){
		return "hello " + arg;
	}
	
	@RequestMapping("/add")
	public String add(Integer number1, Integer number2 ){
		return "result: " + String.valueOf(number1 + number2);
	}
	
	@RequestMapping(value="/json", produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> json(){
		Map<String, Object> map = new HashMap<>();
		map.put("result: ", "json value");
		return map;
	} 
}
