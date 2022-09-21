package com.simplilearn.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class sampleTest {
	@BeforeAll
	public static void beforeall() {
		System.out.println("before all");
	}
	@BeforeEach
	public  void beforeEach() {
		System.out.println("before Each");
	}
	
	@Test
	public  void test1() {
		System.out.println("this is my first test-1");

	}
	@Test
	public  void test2() {
		System.out.println("this is my second test-2");

	}
	@AfterEach
	public  void aftereach() {
		System.out.println("after Each");
	}
	@AfterAll
	public static void Afterall() {
		System.out.println("after all");
	}
	
}
