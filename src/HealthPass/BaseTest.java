package HealthPass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

abstract public class BaseTest {
	public static AndroidDriver<MobileElement> driver;

	public static String PACKAGE_NAME = System.getenv("app_package_dev");
	
	@BeforeSuite
	public void driverSetUp(){
		System.out.println(PACKAGE_NAME);
		DesiredCapabilities caps = new DesiredCapabilities(); // Set the Desired Capabilities
		// caps.setCapability("deviceName", "Mi A2 lite");
		caps.setCapability("deviceName", "HTC");
		// caps.setCapability("udid", "e3db653d0305"); // MI a2 lite
		caps.setCapability("udid", "LF63TYH11820"); // HTC
		caps.setCapability("platformName", "Android");
		// caps.setCapability("platformVersion", "8.1.0");// MI A2 lite
		caps.setCapability("platformVersion", "5.0.2");// HTC
		caps.setCapability("appPackage", PACKAGE_NAME);
		caps.setCapability("appActivity", "global.medicount.healthpass.ui.main.MainActivity");
		caps.setCapability("noReset", "true");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
	} catch (MalformedURLException e) {
		System.out.println(e.getMessage());
	} 
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
