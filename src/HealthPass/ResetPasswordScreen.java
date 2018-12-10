package HealthPass;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ResetPasswordScreen {
	AndroidDriver<MobileElement> driver;

	public ResetPasswordScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void fillMobileNumber(String mobile) throws InterruptedException {
		Thread.sleep(5000);
		//driver.hideKeyboard();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewForgetPassword"))).click();
		Thread.sleep(5000);
		MobileElement phonenumber = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPhoneNumber")));
		phonenumber.click();
		phonenumber.sendKeys(mobile);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSendCode"))).click();
		Thread.sleep(5000);
	}
 
	public void fill_OTP_password(String OTP, String password) throws InterruptedException {
		Thread.sleep(5000);
		MobileElement OTPfield = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextCode")));
		OTPfield.click();
		OTPfield.sendKeys(OTP);
		driver.hideKeyboard();
		Thread.sleep(5000);
		MobileElement passwordfield= driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword")));
		passwordfield.click();
		passwordfield.sendKeys(password);
		driver.hideKeyboard();
		Thread.sleep(5000);
		MobileElement continueButton= driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonContinueToLogin")));
		continueButton.click();
	}
}
