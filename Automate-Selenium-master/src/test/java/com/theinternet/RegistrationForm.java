package com.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationForm {

	@Test(priority = 1,groups = { "negativeTests", "smokeTests" })
	public void incorrectUsernameTest() {
		System.out.println("starting username test");

		// create a driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaj\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		

		// enter username
		driver.navigate().to("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D60612964962%26hvpone%3D%26hvptwo%3D%26hvadid%3D486452179346%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9841073734059651307%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040217%26hvtargid%3Dkwd-49491430%26hydadcr%3D14454_2154375%26gclid%3DCj0KCQjwnP-ZBhDiARIsAH3FSRcBo1jVo-9fxiN07SCChdLA3_mrWvIXAq-6_QjeOC09Jndm3nOnhnsaApgzEALw_wcB&prevRID=YZ4QD3P51H333SXTQAQV&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		System.out.println("page is opened");
		driver.findElement(By.name("customerName")).sendKeys("Balaji");
		sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		sleep(1000);
		driver.findElement(By.name("email")).sendKeys("8072704319");
		sleep(1000);
		driver.findElement(By.name("secondaryLoginClaim")).sendKeys("balajijdeeee@gmail.com");
		sleep(1000);
		driver.findElement(By.name("password")).sendKeys("naren@21");
		sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		sleep(1000);

		
		

		// enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("ragul@123");
		sleep(3000);

		// click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		sleep(5000);
		
		//verifications
		WebElement Message = driver.findElement(By.id("flash"));
		String expectedMessage= "Your username is valid!";
		String actualMessage = Message.getText();
		
		Assert.assertTrue(actualMessage.contains(expectedMessage),"Actual message expected."
				+ "\nActual:" + actualMessage + "\n Expected:" +expectedMessage);
		
		//close browser
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