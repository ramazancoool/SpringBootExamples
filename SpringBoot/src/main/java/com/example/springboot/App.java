package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.example.springboot.controller")
public class App{
	
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
}
