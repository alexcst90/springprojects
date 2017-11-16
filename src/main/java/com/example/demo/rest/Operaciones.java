package com.example.demo.rest;

public class Operaciones {
	private final long id;
    private final String operacion;
    private final int num1;
    private final int num2;

    public  Operaciones(long id, String operacion, int num1, int num2) {
        this.id = id;
        this.operacion = operacion;
        this.num1 = num1;
        this.num2 = num2;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return operacion;
    }
    
    public int getNum1() {
    	return num1;
    }
    public int getNum2() {
    	return num2;
    }
}
