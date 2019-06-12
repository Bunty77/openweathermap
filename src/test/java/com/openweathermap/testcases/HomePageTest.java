package com.openweathermap.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openweathermap.base.TestBase;
import com.openweathermap.pages.API;
import com.openweathermap.pages.HomePage;
import com.openweathermap.pages.Price;
import com.openweathermap.pages.SignIn;
import com.openweathermap.pages.SignUp;
import com.openweathermap.pages.Stations;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest extends TestBase 
{
	HomePage homepage;
	SignIn signin;
	SignUp signup;
	API api;
	Price price;
	Stations stations;
	
	public HomePageTest()
	{
		super();
	}  
	

	@BeforeMethod
	public void setup()
	{
		initialization();
		 homepage = new HomePage();
		  signin = new SignIn();
		  signup = new SignUp();
		  api = new API();
		  price = new Price();
		  stations = new Stations();
	}
	
	@Test(priority=1,description="Verify Title of OpenWeatherMap Site")
	@Severity(SeverityLevel.NORMAL)
	@Story("NEMO-1234- Verify Page Title is correct or Not")
	
	public void homepageTitleTest()
	{
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Сurrent weather and forecast - OpenWeatherMap");
		
		
	}
	
	
	@Test(priority=2,description="Verify Website Logo is Correct")
	@Severity(SeverityLevel.BLOCKER)
	@Story("NEMO-1434- Verify Website Logo is Correct")
	public void homepagelogoTest()
	{
		boolean title = homepage.ValidateLogo();
		Assert.assertTrue(title);	
	}
	
	@Test(priority=3,description="Click on Weather in your City Linkt")
	@Severity(SeverityLevel.NORMAL)
	@Story("NEMO-1434- Click on Weather in your City Link")
	public void searchclick()
	{
		homepage.weatherinyourCity();
			
	}
	
	@Test(priority=4,description="Verify Signin url is returning correct Response")
	@Severity(SeverityLevel.CRITICAL)
	@Story("NEMO-3434- Verify Signin url is returning correct Response")
	public void signinclicklink()
	{
		homepage.signInClick();
		String signinurl = signin.validateSignin();
		System.out.println("Current url:"+signinurl);
		Assert.assertEquals(signinurl, "https://home.openweathermap.org/users/sign_in");
	}
	
	@Test(priority=5,description="Verify SignUP url is returning correct Response")
	@Severity(SeverityLevel.CRITICAL)
	@Story("NEMO-3434- Verify SignUP url is returning correct Response")
	public void signupclicklink()
	{
		homepage.signupClick();
		String signupurl = signup.validateSignup();
		System.out.println("Current url:"+signupurl);
		Assert.assertEquals(signupurl, "https://home.openweathermap.org/users/sign_up");
			
	}
	
	@Test
	public void weatherClick()
	{
		homepage.WeatherClick();
			
	}
	
	@Test
	public void Mapsclick() throws InterruptedException
	{
		homepage.mapsClick();
		
	}
	
	@Test
	public void guide() 
	{
		homepage.guide();
		
	}
	
	@Test
	public void api() throws InterruptedException
	{
		homepage.api();
		String apiurl = api.validateApi();
		System.out.println("Current url:"+apiurl);  
		Assert.assertEquals(apiurl, "https://openweathermap.org/api");
	}
	
	@Test
	public void price() throws InterruptedException
	{
		homepage.price();
		String priceurl = price.validatePrice();
		System.out.println("Current url:"+priceurl);
		Assert.assertEquals(priceurl, "https://openweathermap.org/price");
		
	}
	
	@Test
	public void partners() throws InterruptedException
	{
		homepage.partners();
		
	}
	
	@Test
	public void stations() throws InterruptedException
	{
		homepage.stations();
		String stationsurl = signup.validateSignup();
		System.out.println("Current url:"+stationsurl);
		Assert.assertEquals(stationsurl, "https://openweathermap.org/stations");
		
	}
	
	@Test
	public void widget() throws InterruptedException
	{
		homepage.widgets();
		
	}
	
	@Test
	public void blog() throws InterruptedException
	{
		homepage.blog();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
