package com.openweathermap.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.openweathermap.base.TestBase;

public class SignIn extends TestBase
{

	@FindBy(css ="h3.first-child")
	WebElement Signin;
	
	
	
	public String validateSignin()
	{
		
		return driver.getCurrentUrl();
		
	}
	
}
