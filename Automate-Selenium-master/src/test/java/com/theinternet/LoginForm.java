package com.theinternet;

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

public class LoginForm {
	
	@Test
	public void registrationTest()
	{
		System.out.println("starting registration test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaj\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
	
		//login
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D60456322738%26hvpone%3D%26hvptwo%3D%26hvadid%3D486393568006%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6997137485526089466%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040217%26hvtargid%3Dkwd-298441377801%26hydadcr%3D14451_2154369%26gclid%3DCj0KCQjwnP-ZBhDiARIsAH3FSRc5VrAX7PBVfkTQ4RdZsIz5EePzVzc6bWnwtNjdbXVdgZxlXt9gEZsaArytEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		System.out.println("page is opened");
		driver.findElement(By.name("email")).sendKeys("balajijdeeee@gmail.com");
		sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		sleep(1500);
		driver.findElement(By.name("password")).sendKeys("Balaji@1");
		sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		sleep(1500);
		driver.findElement(By.name("mobilePhoneNumber")).sendKeys("8072704319");
		sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"ap-account-fixup-phone-pin-code-button\"]/span/input")).click();
		sleep(1500);
		
		
		//check box
		driver.findElement(By.xpath("/html//form[@id='signup-form']//samp[@class='customcheckbox']")).click();
		sleep(1500);
		driver.findElement(By.xpath("//form[@id='signup-form']//button[@type='submit']")).click();
		sleep(1500);
		
		
	
		 driver.quit();
		
		
		
	}
	

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}