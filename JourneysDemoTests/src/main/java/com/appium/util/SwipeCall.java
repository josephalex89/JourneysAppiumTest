package com.appium.util;



import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;

import com.appium.base.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeCall extends BaseClass{
	
	
	public void SwipeAction() {
		//temporaraly hard coded values for 
		
		Dimension dimension = driver.manage().window().getSize();
		int startX=(int) (dimension.width * 0.8);
		int startY= (int) (dimension.height *0.5);
		
		int endX=(int) (dimension.width * 0.2);
		int endY=(int) (dimension.height *0.5);	
		
		TouchAction t = new TouchAction(driver);
		t.press(PointOption.point(startX,startY))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(endX, endY)).release().perform();
		
		t = null;
	}
	
	
	
	
	
}
