package com.openweathermap.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.openweathermap.base.TestBase;

import io.qameta.allure.Step;

public class HomePage extends TestBase
{
	//Page Factory 
	@FindBy(css ="img.img-responsive")
	WebElement weblogo;
	
	
	@FindBy(css ="#nav-search")
	WebElement weatherinyourCity;
	
	
	@FindBy(css =".pull-right[href*='sign_in']")
	WebElement signInClick ;
	
	
	@FindBy(css =".pull-right[href*='sign_up']")
	WebElement signupClick;
	
	
	@FindBy(css =".nav__link.bg-hover-color[href*='city']")
	WebElement WeatherClick;
	
	@FindBy(css =".nav__link.dropdown-toggle.bg-hover-color")
	WebElement Maps;
	
	
	@FindBy(css ="ul.dropdown-menu > li:nth-of-type(2) > a")
	WebElement currentsatellitemaps;
	
	@FindBy(css =".nav__link.bg-hover-color[href*='guide']")
	WebElement guide;
	
	@FindBy(css =".nav__link.bg-hover-color[href*='price']")
	WebElement price;
	
	
	@FindBy(css =".nav__link.bg-hover-color[href*='api']")
	WebElement api;
	
	@FindBy(css =".nav__link.bg-hover-color[href*='examples']")
	WebElement partners;
	
	
	@FindBy(css =".nav__link.bg-hover-color[href*='stations']")
	WebElement stations;
	
	@FindBy(css =".nav__link.bg-hover-color[href*='widgets-constructo']")
	WebElement widgetsconstructo;
	
	
	@FindBy(css =".nav__link.bg-hover-color[href*='blog']")
	WebElement blog;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	@Step("Verify Title of the Page Steps")
	public String validateHomePageTitle()
	{
		System.out.println("Navnath Sujgure:"+driver.getTitle());
		return driver.getTitle();
		
	}
	
	@Step("Verify Logo of the Page Steps")
	public boolean ValidateLogo()
	{
		return driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		
	}
	
	
	@Step("Click on Weather in your city Link  Steps")
	public void weatherinyourCity()
	{
		weatherinyourCity.click();
		 
		
	}
	@Step("Click on SignIn Steps")
	public void signInClick()
	{
		signInClick.click();
		
	}
	@Step("Click on Signup Steps")
	public void signupClick()
	{
		signupClick.click();
	}
	
	@Step("Click on Weather Steps")
	public void WeatherClick()
	{
		WeatherClick.click();
		
	}
	@Step("Click on Maps Steps")
	public void mapsClick() throws InterruptedException
	{
		Maps.click();
		Thread.sleep(2000);
		currentsatellitemaps.click();
	}
	
	@Step("Click on Guide Steps")
	public void guide()
	{
		guide.click();
		
	}
	
	@Step("Click on Price Steps")
	public void price()
	{
		price.click();
		
	}
	
	@Step("Click on API Steps")
	public void api()
	{
		api.click();
		
	}
	
	@Step("Click on Partners Steps")
	public void partners()
	{
		partners.click();
		
	}
	@Step("Click on Station Steps")
	public void stations()
	{
		stations.click();
		
	}
	@Step("Click on Widgets Steps")
	public void widgets()
	{
		widgetsconstructo.click();
		
	}
	@Step("Click on Blog Steps")
	public void blog()
	{
		blog.click();
		
	}
	
}
