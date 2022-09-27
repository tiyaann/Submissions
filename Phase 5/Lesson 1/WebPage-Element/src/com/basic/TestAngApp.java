package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAngApp {

	private static String url = "http://localhost:4200";

	public static void main(String[] args) {

		WebDriver webdriver = null;

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		webdriver = new ChromeDriver();

//		clickAccountsButton(webdriver);

		addProductToShoppingCart(webdriver, "ecomm", "headphones", "2");
		
		
//		webdriver.quit();

	}

	private static void addProductToShoppingCart(WebDriver webdriver, String route, String productname, String quantity) {
		webdriver.get(url + "/" + route);
		webdriver.findElement(By.name("productName")).sendKeys(productname);
		webdriver.findElement(By.name("quantity")).sendKeys(quantity);
		webdriver.findElement(By.name("addProduct")).click();
		//webdriver.findElement(By.name("productName")).sendKeys("");
		//webdriver.findElement(By.name("quantity")).sendKeys("");

	}

	private static void clickAccountsButton(WebDriver webdriver) {
		webdriver.get(url);
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.findElement(By.id("accounts1")).click();
	}
	
}