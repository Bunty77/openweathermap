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
	
	@Test
	public void homepageTitleTest()
	{
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Сurrent weather and forecast - OpenWeatherMap");		
	}
	
	
	@Test
	public void homepagelogoTest()
	{
		boolean title = homepage.ValidateLogo();
		Assert.assertTrue(title);	
	}
	
	@Test
	public void searchclick()
	{
		homepage.weatherinyourCity();
			
	}
	
	@Test
	public void signinclicklink()
	{
		homepage.signInClick();
		String signinurl = signin.validateSignin();
		System.out.println("Current url:"+signinurl);
		Assert.assertEquals(signinurl, "https://home.openweathermap.org/users/sign_in");
	}
	
	@Test
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
