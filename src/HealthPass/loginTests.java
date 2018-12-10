package HealthPass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class loginTests extends BaseTest { 
	String mobile1;
	String password1;
	
	@Test(enabled = false)
	public void logout() throws InterruptedException {
		LoginScreen loginScreen = new LoginScreen(driver);
		Thread.sleep(1000);
		// String s = super.driver.getCurrentPackage();
		mobile1 = "7788779977";
		password1 = "Ab123456&";
		loginScreen.loginToApp(mobile1, password1);

		String s = super.driver.currentActivity();
		System.out.println(s);

		// driver.findElementByName("Drawer Open").click();
		// driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Drawer
		// Open']")).click();
		// driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonAddFunds"))).click();
		// ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new
		// UiSelector().text(\"TOP-UP\")").click();
		// driver.findElementByAccessibilityId("Drawer Open").click();
	}

	@Test(enabled = false, priority = 1, description = "Successfull Login with correct credentials")
	public void SuccessLogin() throws InterruptedException {
		LoginScreen loginScreen = new LoginScreen(driver);
		mobile1 = "7788779977";
		password1 = "Ab123456&";
		loginScreen.loginToApp(mobile1, password1);
		Thread.sleep(3000); 
		
		Thread.sleep(3000);
		MobileElement extraPopUpNotNow = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonNotNow")));
		extraPopUpNotNow.click();
		Thread.sleep(3000);
		String s = super.driver.currentActivity();
		Assert.assertTrue(s.contains("global.medicount.healthpass.ui.main.MainActivity"));
		
	}

	@Test(enabled = false, priority = 2, description = "Failed Login with wrong password")
	public void FailedLoginWrongpassword() throws InterruptedException {
		LoginScreen loginScreen = new LoginScreen(driver);
		mobile1 = "7788779977";
		password1 = "Akjjkll56&";
		loginScreen.logoutFromApp();
		Thread.sleep(3000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonLogin"))).click();
		loginScreen.loginToApp(mobile1, password1);
		Thread.sleep(3000);
		MobileElement error_msg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textView_message")));
		String LoginError = error_msg.getText();
		Assert.assertTrue(LoginError.contains("Unable"));
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/button_ok"))).click();
	}

	@Test(enabled = false, priority = 3, description = "Failed Login with wrong phone number")
	public void FailedLoginWrongPhoneNumber() throws InterruptedException {
		LoginScreen loginScreen = new LoginScreen(driver);
		mobile1 = "9874563250";
		password1 = "Ab123456&";
		loginScreen.loginToApp(mobile1, password1);
		Thread.sleep(2000);
		MobileElement loginError = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textView_title")));
		String LoginError = loginError.getText();
		Assert.assertTrue(LoginError.contains("Error"));
	}
}
