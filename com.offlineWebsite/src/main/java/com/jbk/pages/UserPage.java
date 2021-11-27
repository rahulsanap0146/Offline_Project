package com.jbk.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.jbk.objectRepo.UserPageObjectRepo;

import com.utility.ExcelRead;

public class UserPage extends UserPageObjectRepo {
	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyLabelOfAddUser() {
		addUserBtn.click();

		List<WebElement> labelList = inputLabel;

		List<String> actList = new ArrayList<String>();

		for (WebElement list : labelList) {
			String text = list.getText();
			actList.add(text);
		}
		System.out.println(actList);
		List<String> expList = new ArrayList<String>();
		try {
			expList = ExcelRead.readExcelFile(System.getProperty("user.dir")+"/src/test/resources/Data.xls", 5);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (actList.equals(expList))
			return true;
		else
			return false;

	}

	public boolean verfiyAddUser() {

		addUserBtn.click();
		username.sendKeys("Rahul Shankar Sanap");
		mobile.sendKeys("7770080146");
		email.sendKeys("rahulsanap777@gmail.com");
		course.sendKeys("Java");
		password.sendKeys("krishna");
		gender.click();
		WebElement element = state;
		Select select = new Select(element);
		select.selectByIndex(1);
		friendMble.sendKeys("7775868712");
		submitBtn.click();

		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.accept();
		String expAlertMessage = "User Added Successfully. You can not see added user.";
		if (alertMessage.equals(expAlertMessage))
			return true;
		else
			return false;

	}

	public boolean verifyTableHeading() {
		List<WebElement> Heading = tableHeading;

		List<String> actHeadingList = new ArrayList<String>();
		for (WebElement list : Heading) {
			String text = list.getText();
			actHeadingList.add(text);
		}
		List<String> expHeadingList = null;
		try {
			expHeadingList = ExcelRead.readExcelFile(System.getProperty("user.dir")+"/src/test/resources/Data.xls", 6);

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (actHeadingList.equals(expHeadingList))
			return true;
		else
			return false;
	}

	public boolean countState() {
		int actCount = mahaState.size();
		System.out.println(actCount);
		int exptCount = 2;
		if (actCount == exptCount)
			return true;
		else
			return false;
	}

	public boolean countUser() {
		int noOfUser = userList.size();
		int expNoOfUser = 4;
		System.out.println(noOfUser);
		if (noOfUser == expNoOfUser)
			return true;
		else
			return false;

	}

	public boolean verifyDeleteAction() {
		deleteBtn.click();
		Alert alert1 = driver.switchTo().alert();
		String message1 = alert1.getText();
		alert1.accept();
		Alert alert2 = driver.switchTo().alert();
		String message2 = alert2.getText();
		alert2.accept();

		String expMessage1 = "Are you sure you want to delete this user";
		String expMessage2 = "User deleted successfully.";

		if (message1.equals(expMessage1)) {
			if (message2.equals(expMessage2)) {

			}
			return true;
		} 
		else
			return false;

		/*
		 * SoftAssert assert1 = new SoftAssert(); assert1.assertEquals(message1,
		 * expMessage1); assert1.assertEquals(message2, expMessage2);
		 * assert1.assertAll();
		 */

	}

	public boolean verifyStateList() {
		addUserBtn.click();
		List<WebElement> element = stateList;
		List<String> actList = new ArrayList<String>();
		for (WebElement state : element) {
			String list = state.getText();
			actList.add(list);
		}
		System.out.println(actList);
		List<String> expList = new ArrayList<String>();
		expList.add("--Select State--");
		expList.add("Maharashtra");
		expList.add("Delhi");
		expList.add("HP");
		expList.add("Punjab");

		if(actList.equals(expList))
			return true;
		else 
			return false;
	}
	
	
	

}
