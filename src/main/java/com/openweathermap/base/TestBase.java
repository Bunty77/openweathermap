package com.openweathermap.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.openweathermap.utils.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			//System.out.println("pah::::"+prop.getProperty("path") );
			FileInputStream ip = new FileInputStream("config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver");	
			driver = new ChromeDriver(); 
			System.out.println("Browser Launch Successfully");
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "geckodriver");	
			driver = new FirefoxDriver(); 
			System.out.println("Browser Launch Successfully");
		}

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		System.out.println("Url Entered Successfully");
}
	
	
	
	
	}