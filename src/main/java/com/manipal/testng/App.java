package com.manipal.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
}
