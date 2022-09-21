package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculaterTest {
	
		private  Calculator calc;
		
		@BeforeEach 
		public void steup() {
			calc =new Calculator();
			System.out.println("Calculater Intiated");
		}
		@AfterEach
		public void tearDown() {
			calc=null;
			System.out.println("Calculator Closed");
		}
		@Test
		public void addtest() {
			assertEquals(7, calc.add(4, 3));
		}
		@Test
		public void subtest() {
			assertEquals(9, calc.sub(12, 3));
			assertNotEquals(7, calc.sub(12, 3));
		}
		
		@Test
		public void multiplytest() {
			assertEquals(12, calc.multiply(4, 3));
			assertNotEquals(30, calc.multiply(12, 3));
		}
		
		@Test
		public void dividetest() {
			assertEquals(10, calc.divide(100, 10));
			
		}

}
