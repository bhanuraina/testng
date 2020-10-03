package com.manipal.testng;


import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class App {
	
WebDriver driver;
	@Test
		public void testcase1() throws MalformedURLException
	{
		DesiredCapabilities cap =  DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL("http://192.168.1.85:4444/wd/hub"), cap);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}
}
