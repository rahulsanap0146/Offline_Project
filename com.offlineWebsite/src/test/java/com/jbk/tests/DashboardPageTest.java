package com.jbk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;


public class DashboardPageTest {
	
	DashboardPage dp;
	
	WebDriver driver;
	@BeforeMethod
	public void browserIntialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		dp= new DashboardPage(driver);

	}

	@AfterMethod
	public void driverClose() {
		driver.close();
	}
	
	
	@Test
	public void verifyCourses() {
		Assert.assertTrue(dp.verifyCourses());
	}

	@Test
	public void verifyCoursesList() {

		Assert.assertTrue(dp.verifyCoursesList());
	}

	@Test
	public void verifyImage() {
		
		Assert.assertTrue(dp.verifyImage());
	}

	@Test
	public void verifyMenuList() {
		
		Assert.assertTrue(dp.verifyMenuList());
	}

	@Test
	public void verifyMenuInfo() {
		
	}
	@Test
	public void homeLink() {
		Assert.assertTrue(dp.homeLink());;
	}

	@Test
	public void verfiylogoutLink() {
		Assert.assertTrue(dp.verfiylogoutLink());
	}
}
