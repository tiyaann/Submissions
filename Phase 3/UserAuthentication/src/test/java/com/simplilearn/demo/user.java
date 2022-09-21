package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class user {

	private UserAuthentication user;

	@BeforeEach
	public void setup() {
		user = new UserAuthentication();
		System.out.println("UserAuthentication class inititated");
	}

	@AfterEach
	public void tearDown() {
		user = null;
		System.out.println("Class Closed");
	}

	@Test
	public void checkUser() {
		assertEquals("abc@gmail.com", user.username());
	}

	@Test
	public void checkUserNull() {
		assertNotNull(user.username());
	}

	@Test
	public void checkPass() {
		assertEquals("1234", user.paswd());
	}

	@Test
	public void checkPassNull() {
		assertNotNull(user.paswd());
	}

	@Test
	public void checkUser1() {
		String email = user.username();
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		assertEquals(true, matcher.matches());

	}

}
