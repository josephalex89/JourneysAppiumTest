package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.base.BaseClass;

import io.appium.java_client.MobileElement;

public class RegistrationPage extends BaseClass {
		
/*	@FindBy(xpath="//android.widget.EditText[@text='first name']")
	MobileElement firstName;
	
	@FindBy(xpath="//android.widget.EditText[@text='last name']")
	MobileElement lastName;
	
	@FindBy(xpath="//android.widget.EditText[@text='company']")
	MobileElement companyName;
	
	@FindBy(xpath="//android.widget.EditText[@text='select your region...']")
	MobileElement region;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='North, Central and South America']")
	MobileElement checkedNARegion;
	
	@FindBy(xpath="//android.widget.EditText[@text='work email address']")
	MobileElement email;
	
	@FindBy(xpath="//android.widget.EditText[@text='password']")
	MobileElement password;
	
	@FindBy(xpath="//android.widget.TextView[@text='CREATE ACCOUNT']")
	MobileElement createAccountbtn;
	
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}*/
	
	public void createAccountDetails(String fn,String ln,String wemail,String pass,String compname) {
		//Intiializing
 
		MobileElement firstName = driver.findElement(By.xpath("//android.widget.EditText[@text='first name']"));
		MobileElement lastName = driver.findElement(By.xpath("//android.widget.EditText[@text='last name']"));
		MobileElement companyName = driver.findElement(By.xpath("//android.widget.EditText[@text='company']"));
		MobileElement region = driver.findElement(By.xpath("//android.widget.EditText[@text='select your region...']"));
		
		MobileElement email = driver.findElement(By.xpath("//android.widget.EditText[@text='work email address']"));
		MobileElement password = driver.findElement(By.xpath("//android.widget.EditText[@text='password']"));
		MobileElement createAccountbtn = driver.findElement(By.xpath("//android.widget.TextView[@text='CREATE ACCOUNT']"));	
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		companyName.sendKeys(compname);
		region.click();
		MobileElement checkedNARegion = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='North, Central and South America']"));
		checkedNARegion.click();
		email.sendKeys(wemail);
		password.sendKeys(pass);
		createAccountbtn.click();
	}

}
