package com.appium.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver;
	
	public void intitialization() {
		
		try {
			
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G975W");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "192.168.50.111:5555");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			
		desiredCapabilities.setCapability("appPackage", "com.sentiance.journeys");
		desiredCapabilities.setCapability("appActivity", "com.sentiance.journeys.MainActivity");
		
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
			//String sessionID = driver.getSessionId().toString();
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);						
			
			
		} catch (Exception e) {
			
			System.out.println("Cause is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		} 
		
	}
	
	
	
	public void teardown() {
		driver.quit();
	}

}
