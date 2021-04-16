package com.platzi.javatests.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private final List<Long> numeros = new ArrayList<>();
	long result = 0;
	String valor = "";

	public String getCalculated() {
		
		for (Long numero : numeros) {

			if((numero%3) == 0 && (numero%5) == 0) {
				valor = "FizzBuzz";
		    }else if((numero%5) == 0) {
		    	valor = "Buzz";
		    }else if ((numero%3) == 0){
		    	valor = "Fizz";
		    }else {
		    	valor = numero.toString();
		    }    
			
		}
	
		return valor;
	}
	
	public void addNumber(Long valor) {
		numeros.add(valor);
    } 

}
