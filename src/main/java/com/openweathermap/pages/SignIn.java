package com.openweathermap.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.openweathermap.base.TestBase;

import io.qameta.allure.Step;

public class SignIn extends TestBase
{

	@FindBy(css ="h3.first-child")
	WebElement Signin;
	
	
	@Step("Validate Signin Steps")
	public String validateSignin()
	{
		
		return driver.getCurrentUrl();
		
	}
	
}
