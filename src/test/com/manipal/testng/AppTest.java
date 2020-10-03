package com.manipal.testng;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	
   @Before
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver dri = new ChromeDriver();
dri.manage().window().maximize();
dri.get("https://opensource-demo.orangehrmlive.com/");
dri.manage().window().maximize();
dri.findElement(By.name("txtUsername")).click();
dri.findElement(By.name("txtUsername")).clear();
System.out.println(dri.getTitle());
dri.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
dri.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");

System.out.println(dri.findElement(By.xpath("//*[@id='txtPassword']")).getAttribute("id"));
dri.findElement(By.xpath("//*[@id='btnLogin']")).click();


System.out.println(dri.findElement(By.xpath("//*[@id='welcome-menu']")).getAttribute("id"));
dri.findElement(By.xpath("//*[@id='welcome']")).click();
Thread.sleep(200);
dri.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
Thread.sleep(200);
dri.close();
	}
	@Test
	public void TestHelloWorld()
		{
		String actual = "Hi Bhanu";
		String expected = "Hi Bhanu";
		assertEquals(expected, actual);
	}
	@Test
	public void testArrays()
	{
		AppTest  hw= new AppTest();
		String inputArray[]= {"Raj","Raj","Kumar","Ganesh"};
		String expected[]= {"Raj","Kumar","Ganesh"};
		
		assertArrayEquals(expected,inputArray);
	}
}
