package com.example.demo.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.Operaciones;

@RestController
public class CalculadoraService {
	
	
	
	public String calcular( double num1, double num2, String operacion) {
		double resultado = 0;
		if(operacion.equals("suma")) {
			resultado = num1 + num2;
		}else if(operacion.equals("resta")) {
			resultado = num1 - num2;
		}else if(operacion.equals("multiplicacion")) {
			resultado = num1 * num2;
		}else if(operacion.equals("division")) {
			resultado = num1 / num2;
		}
		
		return String.valueOf(resultado);
	}
}
