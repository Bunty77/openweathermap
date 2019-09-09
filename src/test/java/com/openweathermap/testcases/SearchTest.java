/* package com.openweathermap.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openweathermap.base.TestBase;
import com.openweathermap.pages.API;
import com.openweathermap.pages.HomePage;
import com.openweathermap.pages.Price;
import com.openweathermap.pages.Search;
import com.openweathermap.pages.SignIn;
import com.openweathermap.pages.SignUp;
import com.openweathermap.pages.Stations;

public class SearchTest extends TestBase
{
	Search search;
	SearchTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		search = new Search();
	}
	
	@Test
	public void entercityname() throws InterruptedException 
	{
		search.entercitysearch();
		//Thread.sleep(2000);
		search.clickSearch();
		//Thread.sleep(2000);
		String valid = search.validsearchresult();
		Assert.assertEquals(valid, "Pune, IN");
	}
	
	@Test
	public void invalidcitysearch() throws InterruptedException 
	{
		search.invalidSearch();
		//Thread.sleep(2000);
		search.clickSearch();
		//Thread.sleep(2000);
		String invalid = search.invalidsearchresult();
		Assert.assertEquals(invalid, "×\n" + 
				"Not found");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
*/