package com.platzi.javatests.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test_return_fizz() {
		
		FizzBuzz fizz = new FizzBuzz();		
		fizz.addNumber((long) 6); 
		
		assertThat( fizz.getCalculated(), is("Fizz") );
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_return_buzz() {
		
		FizzBuzz fizz = new FizzBuzz();		
		fizz.addNumber((long) 10); 
		
		assertThat( fizz.getCalculated(), is("Buzz") );
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_return_fizzbuzz() {
		
		FizzBuzz fizz = new FizzBuzz();		
		fizz.addNumber((long) 30); 
		
		assertThat( fizz.getCalculated(), is("FizzBuzz") );
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_return_number() {
		
		Long dato = (long) 16;
		FizzBuzz fizz = new FizzBuzz();		
		fizz.addNumber((long) dato); 
		
		assertThat( fizz.getCalculated(), is(dato.toString()) );
	}

}
