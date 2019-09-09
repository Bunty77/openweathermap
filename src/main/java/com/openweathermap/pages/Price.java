package com.openweathermap.pages;

import com.openweathermap.base.TestBase;

import io.qameta.allure.Step;

public class Price extends TestBase
{
	@Step("Validate Price Steps")
	public String validatePrice()
	{
		
		return driver.getCurrentUrl();
		
	}
}
