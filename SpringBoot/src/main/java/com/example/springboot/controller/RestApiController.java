package com.example.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

	private Map<Integer, String> users = new HashMap<Integer, String>();
	
	@RequestMapping(value="/insert")
	public ResponseEntity<String> insertUser(Integer id, String name){
		
		users.put(id, name);
		
		return new ResponseEntity<>("Inserted", HttpStatus.OK);
	}
	
	@RequestMapping(value="/list")
	public ResponseEntity<Map<Integer, String>> listUsers(){
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value="/update")
	public ResponseEntity<String> update(Integer id, String name){
		
		users.put(id, name);
		
		return new ResponseEntity<>("Updated", HttpStatus.OK);
	}
	
}
