package com.openweathermap.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.openweathermap.base.TestBase;

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
	
	public String validateHomePageTitle()
	{
		System.out.println("Navnath Sujgure:"+driver.getTitle());
		return driver.getTitle();
		
	}
	
	
	public boolean ValidateLogo()
	{
		return driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		
	}
	
	
	
	public void weatherinyourCity()
	{
		weatherinyourCity.click();
		 
		
	}
	
	public void signInClick()
	{
		signInClick.click();
		
	}
	
	public void signupClick()
	{
		signupClick.click();
	}
	
	
	public void WeatherClick()
	{
		WeatherClick.click();
		
	}
	
	public void mapsClick() throws InterruptedException
	{
		Maps.click();
		Thread.sleep(2000);
		currentsatellitemaps.click();
	}
	
	public void guide()
	{
		guide.click();
		
	}
	
	public void price()
	{
		price.click();
		
	}
	
	public void api()
	{
		api.click();
		
	}
	
	public void partners()
	{
		partners.click();
		
	}
	
	public void stations()
	{
		stations.click();
		
	}
	public void widgets()
	{
		widgetsconstructo.click();
		
	}
	
	public void blog()
	{
		blog.click();
		
	}
	
}
