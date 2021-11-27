package com.jbk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DownloadPage;


public class DownloadPageTest {
	
	WebDriver driver;

	public DownloadPage dwnldpage;
	@BeforeMethod
	public void browserIntialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/downloads.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		dwnldpage= new DownloadPage(driver);
	}

	@AfterMethod
	public void driverClose() {
		driver.close();
	}
	
	
	
	@Test(priority=1)
	public void verify32BitList(){
		Assert.assertTrue(dwnldpage.verify32bBitList());
	}
	
	@Test(priority=2)
	public void verifyVersionOf32Bit(){
		Assert.assertTrue(dwnldpage.verifyVersionOf32Bit());
	}
	
	@Test(priority=3)
	public void verfiyGoogleWebsite(){
		Assert.assertTrue(dwnldpage.verifyGoogleOfficialWebsite());
	}
	
	

}
