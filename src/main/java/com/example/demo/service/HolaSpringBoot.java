package com.example.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.arquitecturajava")
public class HolaSpringBoot {
	
	public static void main(String [] args){
		SpringApplication.run(HolaSpringBoot.class, args);		
	}
}
