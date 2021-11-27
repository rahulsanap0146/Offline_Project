package com.jbk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.jbk.pages.OperatorPage;

public class OperatorPageTest {
	WebDriver driver;

	public OperatorPage op;

	@BeforeMethod
	public void browserIntialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/operators.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		op= new OperatorPage(driver);
	}

	@AfterMethod
	public void driverClose() {
		driver.close();
	}
	
	@Test
	public void verifyWhatsappFaculty(){
		Assert.assertTrue(op.onlyWhatsappFaculty());
		
	}
	
	@Test
	public void verfiyPhoneCallFaculty(){
		Assert.assertTrue(op.phoneCallFaculty());
	}
	
	@Test
	public void verifyTechnicalFaculty(){
		Assert.assertTrue(op.technicalFaculty());
	}
	
	@Test
	public void verifyFacultyOnSpecificDays(){
		Assert.assertTrue(op.facultyAvailSpecificDays());
	}
	
	@Test
	public void verifyFacultyOnSpecificTime(){
		Assert.assertTrue(op.facultyAvailSpecificTime());
	}
}
