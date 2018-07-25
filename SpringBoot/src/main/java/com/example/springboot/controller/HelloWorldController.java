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
	public String sayMe(String name){
		return "hello " + name;
	}
	
	@RequestMapping("/add")
	public String add(Integer number1, Integer number2 ){
		return "result: " + String.valueOf(number1 + number2);
	}
	
	@RequestMapping(value="/json", produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> json(String arg1, String arg2){
		Map<String, Object> map = new HashMap<>();
		
		map.put("result: ", "json value");
		map.put("arg1: ", arg1);
		map.put("arg2: ", arg2);
		return map;
	} 

}
