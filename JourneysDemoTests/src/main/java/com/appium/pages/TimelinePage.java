package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.base.BaseClass;

import io.appium.java_client.MobileElement;

public class TimelinePage extends BaseClass {
	
	//Object Repo
	/*	@FindBy(xpath="//android.widget.TextView[@text='CONTINUE']")
		MobileElement timelineContinue;	
		
		public TimelinePage() {
			PageFactory.initElements(driver, this);
		}*/
		
		public void timelineContinue() {
			
			MobileElement timelineContinue = driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']"));
			timelineContinue.click();
		}
		
		

}
