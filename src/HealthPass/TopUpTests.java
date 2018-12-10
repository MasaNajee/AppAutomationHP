package HealthPass;

import org.testng.annotations.Test;

public class TopUpTests extends BaseTest{

	@Test(enabled= false, priority=1, description= "Successfull topup ")
	public void validTopUp() throws InterruptedException{
		TopUpScreen TopUp = new TopUpScreen(driver);
		
	}
	
	@Test(enabled= false, priority=2, description= "Invalid amount, less than 200 INR")
	public void invalidTopUpLessThanMin() throws InterruptedException{
		TopUpScreen TopUp = new TopUpScreen(driver);
		
	}
	
	@Test(enabled= false, priority=3, description= "Invalid amount, More than 2000 for low KYC")
	public void invalidTopUpMoreThanMax() throws InterruptedException{
		TopUpScreen TopUp = new TopUpScreen(driver);
		
	}
	
	@Test(enabled= false, priority=4, description= "Topup until exceed limitation for low KYC 10000")
	public void exceedTopUpLimit() throws InterruptedException{
		TopUpScreen TopUp = new TopUpScreen(driver);
		
	}
	
	@Test(enabled= false, priority=5, description= "Open Agent list")
	public void getAgentList() throws InterruptedException{
		TopUpScreen TopUp = new TopUpScreen(driver);
		
	}
	
	@Test(enabled= false, priority=6, description= "Open loan screen")
	public void getLoanScreen() throws InterruptedException{
		TopUpScreen TopUp = new TopUpScreen(driver);
		
	}
	
	
	
	
}
