package loanapplication;

import org.testng.annotations.Test;

public class CarLoanApplicationTests {

	@Test(timeOut = 4000)
	public void CarLoanLoginWeb() {
		System.out.println("Car loan application - web login test");
	}
	
	@Test(groups= {"Smoke"})
	public void CarLoanLoginMobile() {
		System.out.println("Car loan application - mobile login test");
	}
	
	@Test(dependsOnMethods = {"CarLoanLoginWeb"})
	public void CarLoanLoginAPI() {
		System.out.println("Car loan application - API login test");
	}
	
}