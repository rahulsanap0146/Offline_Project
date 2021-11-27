package com.jbk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.UsefulLinkPage;



public class UsefulLinkPageTest {

	WebDriver driver;
	UsefulLinkPage ul;
	@BeforeMethod
	public void browserIntialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/links.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ul= new UsefulLinkPage(driver);
	}

	@AfterMethod
	public void driverClose() {
		driver.close();
	}

	
	@Test
	public void verifyLinksURL(){
		
		Assert.assertTrue(ul.verifyLinksURL());
	}
	
}
