package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class PrivacyAgreePage extends BaseClass {
	
	//Object Repo
	/*@FindBy(xpath="//android.widget.TextView[@text='AGREE & PROCEED']")
	MobileElement privacyAgree;	
	
	public PrivacyAgreePage() {
		PageFactory.initElements(driver, this);
	}*/
	
	public void agreePrivacy() {
		MobileElement privacyAgree = driver.findElement(By.xpath("//android.widget.TextView[@text='AGREE & PROCEED']"));
		privacyAgree.click();
	}
}
