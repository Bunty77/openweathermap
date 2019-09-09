package com.openweathermap.pages;

import com.openweathermap.base.TestBase;

import io.qameta.allure.Step;

public class Stations extends TestBase
{
	@Step("Validate  Stations Steps")
	public String validateStations()
	{
		
		return driver.getCurrentUrl();
		
	}
}
