package com.openweathermap.pages;

import com.openweathermap.base.TestBase;

public class SignUp extends TestBase
{
	
	
	public String validateSignup()
	{
	
		return driver.getCurrentUrl();
	
	}
	
	

}
