package com.appium.pages;

import org.openqa.selenium.By;

import com.appium.base.BaseClass;

import io.appium.java_client.MobileElement;

public class SigninPage extends BaseClass {
	
	public void SignInDetails(String wemail,String pass) {
		//Intiializing
		
		
		MobileElement signInblnk = driver.findElement(By.xpath("//android.widget.TextView[@text='Already have an account?']"));
		signInblnk.click();
		
		MobileElement sEmail = driver.findElement(By.xpath("//android.widget.EditText[@text='work email address']"));
		MobileElement sPassword = driver.findElement(By.xpath("//android.widget.EditText[@text='password']"));
		MobileElement signInbtn = driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));	
		
		sEmail.sendKeys(wemail);
		sPassword.sendKeys(pass);
		signInbtn.click();
	}

}
