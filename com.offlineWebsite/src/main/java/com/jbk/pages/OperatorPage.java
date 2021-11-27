package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepo.OperatorPageObjectRepo;

public class OperatorPage extends OperatorPageObjectRepo {

	WebDriver driver;

	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean onlyWhatsappFaculty() {
		ArrayList<String> actList = new ArrayList<String>();

		List<WebElement> person = personList;
		List<WebElement> wayToConnect = wayOfConnectList;
		int a = 0;
		for (WebElement element : wayToConnect) {
			if (element.getText().contains("Whats App Only")) {
				String text = person.get(a).getText();
				actList.add(text);
			}
			a++;
		}
		System.out.println(actList);
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Kiran");
		expList.add("Darshit");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}

	}

	public boolean phoneCallFaculty() {
		ArrayList<String> actList = new ArrayList<String>();

		List<WebElement> person = personList;

		List<WebElement> wayToConnect = wayOfConnectList;

		int a = 0;
		for (WebElement element : wayToConnect) {
			if (element.getText().contains("Phone Call")) {
				String text = person.get(a).getText();
				actList.add(text);
			}
			a++;
		}
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Neelam");
		expList.add("Seema");
		expList.add("Varsha");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}

	}
	
	public boolean technicalFaculty() {
		ArrayList<String> actList = new ArrayList<String>();

		List<WebElement> person = personList;

		List<WebElement> wayToConnect = forList;

		int a = 0;
		for (WebElement element : wayToConnect) {
			if (element.getText().contains("Technical")) {
				String text = person.get(a).getText();
				actList.add(text);
			}
			a++;
		}
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Kiran");
		expList.add("Neelam");
		expList.add("Darshit");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}

	}
	
	public boolean facultyAvailSpecificDays() {
		ArrayList<String> actList = new ArrayList<String>();

		List<WebElement> person = personList;

		List<WebElement> wayToConnect =timingList;

		int a = 0;
		for (WebElement element : wayToConnect) {
			if (element.getText().contains("Saturday-Sunday")) {
				String text = person.get(a).getText();
				actList.add(text);
			}
			a++;
		}
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Darshit");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}

	}
	
	public boolean facultyAvailSpecificTime() {
		ArrayList<String> actList = new ArrayList<String>();

		List<WebElement> person = personList;

		List<WebElement> wayToConnect =timingList;

		int a = 0;
		for (WebElement element : wayToConnect) {
			if (element.getText().contains("09:00 AM to 06:00 PM ")) {
				String text = person.get(a).getText();
				actList.add(text);
			}
			a++;
		}
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Neelam");
		expList.add("Seema");
		expList.add("Varsha");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*
 * public void verifyEmailWayOfConnection() { List<WebElement> emailList =
 * email; List<String>actList= new ArrayList<String>(); for(WebElement
 * list:emailList){ } System.out.println(actList); }
 */
