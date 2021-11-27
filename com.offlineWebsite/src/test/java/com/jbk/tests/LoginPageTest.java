package com.jbk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.testbase.TestBase;

public class LoginPageTest extends TestBase{
	WebDriver driver;

	public LoginPage lp;

	@BeforeMethod
	public void browserIntialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
	}

	@AfterMethod
	public void driverClose() {
		driver.close();
	}

	@Test
	public void verfiyLogo() {
		Assert.assertEquals(lp.jbkLogo(), true);
	}

	@Test
	public void verfiyHeading(){
		Assert.assertTrue(lp.jbkheading());
	}
	
	@Test
	public void verifySubHeading(){
		Assert.assertTrue(lp.subHeading());
	}
	
	@Test
	public void verifyInfoMessage(){
		Assert.assertTrue(lp.infoMessage());
	}
	
	@Test
	public void verifyEmailPlaceholder(){
		Assert.assertTrue(lp.verifyEmailPlaceholder());
	}
	
	@Test
	public void verifyPassordPlaceholder(){
		Assert.assertTrue(lp.verifyPasswordPlaceholder());
	}
	
	@Test
	public void verifyNewMemberLink(){
		Assert.assertTrue(lp.verifyPasswordPlaceholder());
	}
	
	@Test
	public void verifyRegisterNewMember(){
		Assert.assertTrue(lp.verifyRegisterNewMember());
	}
	
	@Test
	public void verifyAdddingNewMember(){
		Assert.assertTrue(lp.registerNewMember());
	}
	@Test
	public void verifyValidLogin(){
		Assert.assertTrue(lp.validLogin());
	}
	
	
	
}
