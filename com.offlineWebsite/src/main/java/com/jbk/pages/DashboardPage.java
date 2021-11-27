package com.jbk.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.jbk.objectRepo.DashboardPageObjectRepo;
import com.utility.ExcelRead;

public class DashboardPage extends DashboardPageObjectRepo {
	WebDriver driver;

	public DashboardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public boolean verifyCourses() {
		List<WebElement> actCourse =course;

		List<String> actCourseList = new ArrayList<String>();

		for (WebElement list : actCourse) {
			String text = list.getText();
			System.out.println(text);
			actCourseList.add(text);
		}
		
		List<String> excelList = null;
		try {
			excelList = ExcelRead.readExcelFile(System.getProperty("user.dir")+"/src/test/resources/Data.xls",1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		if(actCourseList.equals(excelList))
			return true;
		else 
			return false;
	}
	
	public boolean verifyCoursesList() {
		List<WebElement> actName = profile;

		List<String> actList = new ArrayList<String>();

		for (WebElement list : actName) {
			String text = list.getText();
			System.out.println(text);
			actList.add(text);
		}
		
		List<String> excel = null;
		try {
			excel = ExcelRead.readExcelFile(System.getProperty("user.dir")+"/src/test/resources/Data.xls",2);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		List<String> expCourseList1 = new ArrayList<String>();

		expCourseList1.add("Automation Testing");
		expCourseList1.add("Software Development");
		expCourseList1.add("Data Science");
		expCourseList1.add("Web Development");
		
		if(actList.equals(excel))
				return true;
		else 
			return false;
		
	}
	
	public boolean verifyImage() {
		boolean status =image.isDisplayed();
		return status;
	}
	
	public boolean verifyMenuList() {
		List<String> actMenuList = new ArrayList<String>();

		List<WebElement> menuList =menu;

		for (WebElement list : menuList) {
			String value = list.getText();
			System.out.println("MenuList : " + value);
			actMenuList.add(value);
		}

		List<String> expMenuList = new ArrayList<String>();
		expMenuList.add("Dashboard");
		expMenuList.add("Users");
		expMenuList.add("Operators");
		expMenuList.add("Useful Links");
		expMenuList.add("Downloads");
		expMenuList.add("Logout");

		if(actMenuList.equals(expMenuList))
			return true;
		else 
			return false;
	}
	public void verifyMenuInfo() {
		String mainWind = driver.getWindowHandle();
		System.out.println(mainWind);
		List<WebElement> moreInfoList = moreInfo;
		for (WebElement text : moreInfoList) {
			text.click();
		}

		Set<String> allWind = driver.getWindowHandles();

		for (String window : allWind) {

			System.out.println("Id of Window is: " + window);

			driver.switchTo().window(window);

			System.out.println("Title of window is : " + driver.getTitle());

			System.out.println(driver.getCurrentUrl());

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (!window.equals(mainWind))
				driver.close();
		}
	}
	public boolean homeLink() {
		homeLink.click();
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";
		if(actTitle.equals(expTitle))
			return true;
		else
			return false;
	}
	public boolean verfiylogoutLink() {
		logoutBtn.click();
		String actMessage = driver.findElement(By.xpath("//p[text()='Logout successfully']")).getText();
		String expMessage = "Logout successfully";
		if(actMessage.equals(expMessage))
			return true;
		else
			return false;
	}
	
	public UserPage navigateToUserPage(WebDriver driver){
		userBtn.click();
		return new UserPage(driver);
		
	}
	public OperatorPage navigateToOperatorPage(WebDriver driver){
		operatorButton.click();
		return new OperatorPage(driver);
	}
	
	public UsefulLinkPage navigateToUsefulLinkPage(WebDriver driver){
		usefulLinkBtn.click();
		return new UsefulLinkPage(driver);
	}
	
	public DownloadPage navigateToDownloadPage(WebDriver driver){
		downloadBtn.click();
		return new DownloadPage(driver);
	}
	
	public LoginPage navigateToLoginPageByLogoutBtn(WebDriver driver){
		logoutLinkBtn.click();
		return new LoginPage(driver);
	}
	
}

