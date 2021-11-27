package com.jbk.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.jbk.pages.UserPage;

public class UserPageTest {
	WebDriver driver;
	UserPage up =null;
	@BeforeMethod
	public void browserIntialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/users.html#");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		up= new UserPage(driver);
	}

	@AfterMethod
	public void driverClose() {
		driver.close();
	}

	@Test
	public void verifyLabelOfAddUser() {
		
		Assert.assertTrue(up.verifyLabelOfAddUser());
	}

	@Test
	public void verfiyAddUser() {

		Assert.assertTrue(up.verfiyAddUser());
	}

	@Test
	public void verifyTableHeading() {
		
		Assert.assertTrue(up.verifyTableHeading());
	}

	@Test
	public void countState() {

		Assert.assertTrue(up.countState());
	}

	@Test
	public void countUser() {
	
		Assert.assertTrue(up.countUser());
	}

	@Test
	public void verifyDeleteAction() {
		Assert.assertTrue(up.verifyDeleteAction());
		
		/*
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(message1, expMessage1);
		assert1.assertEquals(message2, expMessage2);
		assert1.assertAll();*/

	}

	@Test
	public void verifyStateList() {
		Assert.assertTrue(up.verifyStateList());

	}

	/*@Test
	public void navigate(){
		up.navigateToOperatorPage(driver);
	}*/

}
