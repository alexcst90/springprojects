package com.example.demo.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculadoraService;

@RestController
public class CalculadoraController {
	
    @Autowired
    private CalculadoraService calculadoraService;
    
    
    @GetMapping("/operaciones")
	public String operaciones(
			@RequestParam(value="ope") String operacion,
			@RequestParam(value="num1") double num1,
			@RequestParam(value="num2") double num2) 	
	{
		return calculadoraService.calcular(num1, num2, operacion);
	}
}
