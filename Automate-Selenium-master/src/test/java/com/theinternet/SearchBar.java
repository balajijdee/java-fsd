package com.theinternet;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBar {
	
	@Test
	public void registrationTest()
	{
		System.out.println("starting registration test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaj\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
	
		//login
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("page is opened");
		driver.findElement(By.name("field-keywords")).sendKeys("Watches");
		sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		sleep(1500);
		
		
		
	}
	

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
