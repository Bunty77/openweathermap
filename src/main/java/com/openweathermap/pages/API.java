package com.openweathermap.pages;

import com.openweathermap.base.TestBase;

public class API extends TestBase
{

	public String validateApi()
	{
		
		return driver.getCurrentUrl();
		
	}
	
}
