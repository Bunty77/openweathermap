package com.openweathermap.pages;

import com.openweathermap.base.TestBase;

import io.qameta.allure.Step;

public class SignUp extends TestBase
{
	
	@Step("Click on SignUP Steps")
	public String validateSignup()
	{
	
		return driver.getCurrentUrl();
	
	}
	
	

}
