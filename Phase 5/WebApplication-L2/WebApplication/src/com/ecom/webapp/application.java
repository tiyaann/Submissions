package com.ecom.webapp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class application {
	WebDriver wd;
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() throws InterruptedException {
		
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		wd.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
	      wd.findElement(By.id("createAccountSubmit")).click();
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Tiya Ann Siby");
	      Thread.sleep(5000);
	      //wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_email")).sendKeys("tiyaann@gmail.com");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");
	      Thread.sleep(5000);
	     // wd.findElement(By.id("ap_password_check")).sendKeys("12345678");
	      //Thread.sleep(5000);
	     wd.findElement(By.id("continue")).click();
	}
	
	      @Test(priority = 2)
	  public void login() throws InterruptedException {
		
		

		 wd.findElement(By.id("nav-link-accountList")).click();
		 Thread.sleep(5000);
	     wd.findElement(By.id("ap_email")).sendKeys("tiyaannsiby@gmail.com");
	     Thread.sleep(5000);
		  wd.findElement(By.id("continue")).click();
		  Thread.sleep(5000);
	    // wd.findElement(By.id("ap_password")).sendKeys("12345678");
	       


	  }
	 
	  @BeforeMethod
	    public void startbrowser()
	    {
		  System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		 
		  	 wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
	      	 wd.manage().window().maximize();
	      	   
	    }



	      @AfterMethod
	    public void closeBrowser()
	    {
	        wd.close();
	    }
	  

}