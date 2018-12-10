package HealthPass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class RegistrationTests extends BaseTest{
	

	@Test(enabled= false, priority=1, description= "Successfull registration using Driver lic")
	public void SuccessRegDriverLic() throws InterruptedException{
		RegistrationScreen Registration = new RegistrationScreen(driver);
		Registration.registrationform();
		Thread.sleep(3000);
		Registration.registrationFillusingDriverLic("9900220022","automation lic3", "test1" , "6548689559","Ab123456&");
		Thread.sleep(6000);
		MobileElement otpTextField = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode:")));
		otpTextField.sendKeys("000000");
		Thread.sleep(5000);
		MobileElement checkbox = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/checkBoxPrivacyPolicyAndTerms")));
		checkbox.click();
		Thread.sleep(5000);
		MobileElement submit = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSubmit")));
		submit.click();
		Thread.sleep(5000);
		MobileElement FinishReg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewSkip")));
		String result = FinishReg.getText();
		Assert.assertTrue(result.contains("Skip and finish"));
		Thread.sleep(5000);
		FinishReg.click();
		Thread.sleep(5000);
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.logoutFromApp();
	}
	@Test(enabled= false, priority=2, description= "Successfull registration using Aadhar number")
	public void SuccessRegAadhar() throws InterruptedException{
		RegistrationScreen Registration = new RegistrationScreen(driver);
		Registration.registrationform();
		Registration.registrationFillusingAadhar("7995552220","automation3", "test" , "222666555444","Ab123456&");
		Thread.sleep(3000);
		MobileElement otpTextField = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode:")));
		otpTextField.sendKeys("000000");
		Thread.sleep(8000);
		MobileElement checkbox = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/checkBoxPrivacyPolicyAndTerms")));
		checkbox.click();
		Thread.sleep(8000);
		MobileElement submit = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSubmit")));
		submit.click();
		Thread.sleep(5000);
		MobileElement FinishReg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewSkip")));
		String result = FinishReg.getText();
		Assert.assertTrue(result.contains("Skip and finish"));
		Thread.sleep(5000);
		FinishReg.click();
		Thread.sleep(5000);
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.logoutFromApp();
	}
	@Test(enabled= false, priority=3, description= "Successfull registration using Pan Number")
	public void SuccessRegPan() throws InterruptedException{
		RegistrationScreen Registration = new RegistrationScreen(driver);
		Registration.registrationform();
		Registration.registrationFillusingPan("9995052222","automation pan2", "test" , "PANHM2563M","Ab123456&");
		Thread.sleep(8000);
		MobileElement otpTextField = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode:")));
		otpTextField.sendKeys("000000");
		Thread.sleep(5000);
		MobileElement checkbox = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/checkBoxPrivacyPolicyAndTerms")));
		checkbox.click();
		Thread.sleep(5000);
		driver.hideKeyboard();
		Thread.sleep(5000);
		MobileElement submit = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSubmit")));
		submit.click();
		Thread.sleep(5000);
		MobileElement FinishReg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewSkip")));
		String result = FinishReg.getText();
		Assert.assertTrue(result.contains("Skip and finish"));
		Thread.sleep(5000);
		FinishReg.click();
		Thread.sleep(5000);
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.logoutFromApp();
	}
	@Test(enabled= false, priority=4, description= "Successfull registration using Voter ID")
	public void SuccessRegVoter() throws InterruptedException{
		RegistrationScreen Registration = new RegistrationScreen(driver);
		Registration.registrationform();
		Registration.registrationFillusingVoter("8885550000","automation voter1", "test" , "9554563250","Ab123456&");
		Thread.sleep(8000);
		MobileElement otpTextField = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode:")));
		otpTextField.sendKeys("000000");
		Thread.sleep(5000);
		MobileElement checkbox = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/checkBoxPrivacyPolicyAndTerms")));
		checkbox.click();
		Thread.sleep(5000);
		driver.hideKeyboard();
		MobileElement submit = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSubmit")));
		submit.click();
		Thread.sleep(5000);
		MobileElement FinishReg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewSkip")));
		String result = FinishReg.getText();
		Assert.assertTrue(result.contains("Skip and finish"));
		Thread.sleep(5000);
		FinishReg.click();
		Thread.sleep(5000);
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.logoutFromApp();
	}
	@Test(enabled= false, priority=4, description= "Successfull registration using agent")
	public void SuccessRegAgent() throws InterruptedException{
		RegistrationScreen Registration = new RegistrationScreen(driver);
		Registration.registrationform();
		Registration.registrationFillWithAgent("6665552222","automation Agent", "test1" , "9874565550","Ab123456&", "12377");
		Thread.sleep(5000);
		MobileElement otpTextField = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode:")));
		otpTextField.click();
		otpTextField.sendKeys("000000");
		Thread.sleep(5000);
		MobileElement checkbox = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/checkBoxPrivacyPolicyAndTerms")));
		checkbox.click();
		Thread.sleep(5000);
		MobileElement submit = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSubmit")));
		submit.click();
		Thread.sleep(5000);
		MobileElement FinishReg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewSkip")));
		String result = FinishReg.getText();
		Assert.assertTrue(result.contains("Skip and finish"));
		Thread.sleep(5000); 
		FinishReg.click();
		Thread.sleep(5000);
		LoginScreen loginScreen = new LoginScreen(driver);
		loginScreen.logoutFromApp();
	}
	@Test(enabled= false, priority=6, description= "Invalid registration OTP")
	public void invalidOTP() throws InterruptedException{
		RegistrationScreen Registration = new RegistrationScreen(driver);
		Registration.registrationform(); 
		Registration.registrationFillusingDriverLic("7770000222","automation user", "test1" , "6947897","Ab123456&");
		Thread.sleep(8000);
		driver.hideKeyboard();
		Thread.sleep(8000);
		MobileElement otpTextField = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode:")));
		otpTextField.click();
		otpTextField.sendKeys("987456");
		driver.hideKeyboard();
		MobileElement checkbox = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/checkBoxPrivacyPolicyAndTerms")));
		checkbox.click();
		Thread.sleep(5000);
		MobileElement submit = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSubmit")));
		submit.click();
		Thread.sleep(7000);
		MobileElement errorTitle = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewTitle")));
		String invalidError = errorTitle.getText();
		Assert.assertTrue(invalidError.contains("Invalid Code"));
	} 
	
}
