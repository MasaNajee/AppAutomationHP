package HealthPass;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegistrationScreen{
  
	AndroidDriver<MobileElement> driver;
	
	public RegistrationScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver; 
	}
	public void registrationform() throws InterruptedException{ //how to get registration form
		LoginScreen login = new LoginScreen(driver);
		login.loginToApp("8800880088", "Ab123456&");
		Thread.sleep(8000);
		//driver.findElement(By.id("BaseTest.PACKAGE_NAME.concat(:id/buttonNotNow")).click();
		//driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElementByAccessibilityId("Drawer Open").click();
		((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Log Out\")").click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonSignUp"))).click();
	}
	
	public void registrationFillusingDriverLic(String mobile, String firstName, String lastName, String idNumber, String password) throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextMobileNumber"))).sendKeys(mobile);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).sendKeys(firstName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).sendKeys(lastName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextDriversLicense"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextDriversLicense"))).sendKeys(idNumber);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).sendKeys(password);
		driver.hideKeyboard();
		Thread.sleep(8000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonNext"))).click();
		Thread.sleep(8000);
		}
	public void registrationFillusingAadhar(String mobile, String firstName, String lastName, String idNumber, String password) throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextMobileNumber"))).sendKeys(mobile);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).sendKeys(firstName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).sendKeys(lastName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/radioButtonNoDriversLicense"))).click();
		driver.hideKeyboard();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextId"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextId"))).sendKeys(idNumber);
		driver.hideKeyboard();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).sendKeys(password);
		driver.hideKeyboard();
		Thread.sleep(8000);
		driver.findElement(By.id("BaseTest.PACKAGE_NAME.concat(:id/buttonNext")).click();
	}
	public void registrationFillusingPan(String mobile, String firstName, String lastName, String idNumber, String password) throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextMobileNumber"))).sendKeys(mobile);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).sendKeys(firstName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).sendKeys(lastName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/radioButtonNoDriversLicense"))).click();
		Thread.sleep(5000);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/spinnerProofType"))).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Pan Card\")").click();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextId"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextId"))).sendKeys(idNumber);
		driver.hideKeyboard();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).sendKeys(password);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonNext"))).click();
	}
	public void registrationFillusingVoter(String mobile, String firstName, String lastName, String idNumber, String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextMobileNumber"))).sendKeys(mobile);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).sendKeys(firstName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).sendKeys(lastName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/radioButtonNoDriversLicense"))).click();
		Thread.sleep(5000);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/spinnerProofType"))).click();
		Thread.sleep(5000);
		((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().text(\"Voter ID\")").click();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextId"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextId"))).sendKeys(idNumber);
		driver.hideKeyboard();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).sendKeys(password);
		driver.hideKeyboard();
		Thread.sleep(8000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonNext"))).click();
		Thread.sleep(8000);
	}
	public void registrationFillWithAgent(String mobile, String firstName, String lastName, String idNumber, String password, String agentID) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextMobileNumber"))).sendKeys(mobile);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextFirstName"))).sendKeys(firstName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextLastName"))).sendKeys(lastName);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextDriversLicense"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextDriversLicense"))).sendKeys(idNumber);
		Thread.sleep(5000);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextPassword"))).sendKeys(password);
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextAgentCodeHeader"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextAgentCode"))).click();
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/editTextAgentCode"))).sendKeys(agentID);
		Thread.sleep(5000);
		driver.hideKeyboard();
		Thread.sleep(8000);
		driver.findElement(By.id(BaseTest.PACKAGE_NAME.concat(":id/buttonNext"))).click();
		Thread.sleep(8000);
	}
}
