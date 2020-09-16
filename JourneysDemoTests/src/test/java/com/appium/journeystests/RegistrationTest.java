package com.appium.journeystests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.base.BaseClass;
import com.appium.pages.PrivacyAgreePage;
import com.appium.pages.RegistrationPage;
import com.appium.pages.SigninPage;
import com.appium.pages.TimelinePage;
import com.appium.util.SwipeCall;

public class RegistrationTest extends BaseClass{
	
	PrivacyAgreePage privacyPage;
	TimelinePage timePage;
	RegistrationPage regPage;
	SwipeCall swipe;
	SigninPage signinPage;
	
	public RegistrationTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intitialization();
		privacyPage = new PrivacyAgreePage();
		timePage = new TimelinePage();
		regPage = new RegistrationPage();
		swipe = new SwipeCall();
		signinPage = new SigninPage();
	}
	
	@Test(priority=1)
	public void registration() throws InterruptedException {
		privacyPage.agreePrivacy();
		swipe.SwipeAction();
		Thread.sleep(6000);
		swipe.SwipeAction();
		timePage.timelineContinue();
		regPage.createAccountDetails("Joseph", "Alex", "test.126@hotmail.com", "Testj@1234", "jobapplicant");
	}
	
	@Test(priority=2)
	public void alreadySignUp() throws InterruptedException {
		privacyPage.agreePrivacy();
		swipe.SwipeAction();
		Thread.sleep(5000);
		swipe.SwipeAction();
		timePage.timelineContinue();
		signinPage.SignInDetails("joelalex.joe@gmail.com", "Joe@sent2020");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
}
