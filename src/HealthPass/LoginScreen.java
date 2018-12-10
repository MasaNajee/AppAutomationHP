package HealthPass;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginScreen {
	
	AndroidDriver<MobileElement> driver;
	
	public LoginScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void loginToApp(String mobile, String pass) throws InterruptedException {
		Thread.sleep(3000);
		MobileElement mobileNumber = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPhoneNumber")));
		MobileElement passwordText = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword")));
		MobileElement loginButton = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonLogin")));
		mobileNumber.clear();
		mobileNumber.sendKeys(mobile);
		passwordText.click();
		passwordText.clear();
		passwordText.sendKeys(pass);
		loginButton.click();
		
	}
	public void logoutFromApp() throws InterruptedException {
		Thread.sleep(3000);
		MobileElement leftdrawer = driver.findElement(By.className("android.widget.ImageButton"));
		
		leftdrawer.click();
		Thread.sleep(2000);
		MobileElement LogoutButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Log Out\")");
		
		
		LogoutButton.click();
		Thread.sleep(2000);
		
		MobileElement LogoutOK = driver.findElement(By.id("android:id/button1"));
		LogoutOK.click();
	}
	
}
