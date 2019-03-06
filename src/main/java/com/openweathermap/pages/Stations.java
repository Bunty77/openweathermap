package com.openweathermap.pages;

import com.openweathermap.base.TestBase;

public class Stations extends TestBase
{

	public String validateStations()
	{
		
		return driver.getCurrentUrl();
		
	}
}
