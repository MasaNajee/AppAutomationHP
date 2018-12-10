package HealthPass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ResetPasswordTests extends BaseTest {
	@Test(enabled = false, priority = 1, description = "Reset password Successfully")
	public void SuccessReset() throws InterruptedException {
		ResetPasswordScreen Resetpassword = new ResetPasswordScreen(driver);
		Thread.sleep(5000);
		Resetpassword.fillMobileNumber("7774441111");
		Thread.sleep(5000);
		Resetpassword.fill_OTP_password("000000", "Masa1994");
		Thread.sleep(6000);
		String loginActivity = super.driver.currentActivity();
		System.out.println(loginActivity);
		Assert.assertTrue(loginActivity.contains("global.medicount.healthpass.ui.login.LoginActivity"));
	}

	@Test(enabled = false, priority = 2,dependsOnMethods = { "SuccessReset" }, description = "Login using new password")
	public void LoginAfterReset() throws InterruptedException {
		LoginScreen LoginScreen = new LoginScreen(driver);
		Thread.sleep(5000);
		LoginScreen.loginToApp("7774441111", "Masa1994");
		Thread.sleep(5000);
		String mainActivity = super.driver.currentActivity();
		Assert.assertTrue(mainActivity.contains("global.medicount.healthpass.ui.main.MainActivity"));
		Thread.sleep(5000);
		LoginScreen.logoutFromApp();
		driver.resetApp();
		Thread.sleep(5000);
	}

	@Test(enabled = false, priority = 3, description = "Enter not registered phone number and get error message")
	public void InvalidPhoneNumber() throws InterruptedException {
		// error message id = global.medicount.healthpass.dev:id/textView_message
		// error message text= Could not find a user that matches the entered data
		ResetPasswordScreen Resetpassword = new ResetPasswordScreen(driver);
		Thread.sleep(5000);
		Resetpassword.fillMobileNumber("7505475120");
		Thread.sleep(5000);
		MobileElement errorMsg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textView_message")));
		String errorMsgText = errorMsg.getText();
		Assert.assertTrue(errorMsgText.contains("Could not find a user that matches the entered data"));
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/button_ok"))).click();
		driver.resetApp();
		Thread.sleep(5000);
		
	}

	@Test(enabled = false, priority = 3, description = "Enter non-Indian phone number and get Alert")
	public void NonindianPhoneNumber() throws InterruptedException {
		// alert id = global.medicount.healthpass.dev:id/textinput_error
		// text= Invalid phone number
		ResetPasswordScreen Resetpassword = new ResetPasswordScreen(driver);
		Thread.sleep(5000);
		Resetpassword.fillMobileNumber("0120145698");
		Thread.sleep(5000);
		MobileElement alert = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textinput_error")));
		String alertText = alert.getText();
		Assert.assertTrue(alertText.contains("Invalid phone number"));
		driver.resetApp();
		Thread.sleep(5000); 
		
	}

	@Test(enabled = false, priority = 4, description = "Enter invalid OTP and getting error message")
	public void InvalidOTP() throws InterruptedException {
		// error message id =global.medicount.healthpass.dev:id/textView_message
		// error message text= Invalid OTP
		ResetPasswordScreen Resetpassword = new ResetPasswordScreen(driver);
		Thread.sleep(5000);
		Resetpassword.fillMobileNumber("7774441111");
		Thread.sleep(5000);
		Resetpassword.fill_OTP_password("987456", "Masa1994");
		Thread.sleep(6000);
		MobileElement errorMsg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textView_message")));
		String errorMsgText = errorMsg.getText();
		Assert.assertTrue(errorMsgText.contains("Invalid OTP"));
		driver.resetApp();
		Thread.sleep(5000);
	}

	@Test(enabled = false, priority = 5, description = "Enter invalid password and getting error message")
	public void InvalidPassword() throws InterruptedException {
		// alert id =global.medicount.healthpass.dev:id/textinput_error
		// alert text= Invalid password
		ResetPasswordScreen Resetpassword = new ResetPasswordScreen(driver);
		Thread.sleep(5000);
		Resetpassword.fillMobileNumber("7774441111");
		Thread.sleep(5000);
		Resetpassword.fill_OTP_password("000000", "0120");
		Thread.sleep(6000);
		MobileElement alertMsg = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textinput_error")));
		String alertMsgText = alertMsg.getText();
		Assert.assertTrue(alertMsgText.contains("Invalid password"));
		driver.resetApp();
		Thread.sleep(5000);
	}

	@Test(enabled = false, priority = 6, description = "Click on resend Code and stay on the same screen")
	public void ResendOTP() throws InterruptedException {
		
		ResetPasswordScreen Resetpassword = new ResetPasswordScreen(driver);
		Thread.sleep(5000);
		Resetpassword.fillMobileNumber("7774441111");
		Thread.sleep(5000);
		MobileElement resend = driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/customTextViewResendCode")));
		resend.click();
		String resetActivity = super.driver.currentActivity();
		Assert.assertTrue(resetActivity.contains("global.medicount.healthpass.ui.resetPassword.ResetPasswordActivity"));
		driver.resetApp();
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 7, description = "Open reset password screen from left drawer")
	public void ResetPasswordLeftDrawer() throws InterruptedException {
		LoginScreen LoginScreen = new LoginScreen(driver);
		Thread.sleep(5000);
		LoginScreen.loginToApp("7774441111", "Masa1994");
		Thread.sleep(3000);
		MobileElement leftdrawer = driver.findElement(By.className("android.widget.ImageButton"));
		leftdrawer.click();
		Thread.sleep(2000);
		MobileElement SettingsButton = ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Settings\")");
		SettingsButton.click();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/textViewChangePassword"))).click();
		Thread.sleep(5000);
		String resetActivity = super.driver.currentActivity();
		Assert.assertTrue(resetActivity.contains("global.medicount.healthpass.ui.resetPassword.ResetPasswordActivity"));
		driver.closeApp();
		Thread.sleep(5000);
	}

}
