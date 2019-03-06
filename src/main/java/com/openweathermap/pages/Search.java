package com.openweathermap.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openweathermap.base.TestBase;

public class Search extends TestBase
{

	@FindBy(css ="input.form-control.border-color")
	WebElement city;
	
	@FindBy(css ="button.btn.btn-orange")
	WebElement search;
	
	@FindBy(css ="tbody > tr:first-child > td:nth-of-type(2) > b:first-child > a")
	WebElement validsearch;
	
	@FindBy(css ="div.alert.alert-warning")
	WebElement invalidsearch;
	
	public Search() 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	String cityname = prop.getProperty("city");
	String invalidcity = prop.getProperty("invalidcity");
	
	public void entercitysearch() throws InterruptedException
	{
		
		city.sendKeys(cityname);
		
		
	}
	
	
	public void invalidSearch() throws InterruptedException
	{
		city.sendKeys(invalidcity);
		
	}
	
	public void clickSearch()
	{
		search.click();
	}
	
	public String validsearchresult()
	{
		System.out.println("Valid:"+validsearch.getText());
		return validsearch.getText();
	}
	
	public String invalidsearchresult()
	{
		System.out.println("Invalid:"+invalidsearch.getText());
		return invalidsearch.getText();
	}
	
}
