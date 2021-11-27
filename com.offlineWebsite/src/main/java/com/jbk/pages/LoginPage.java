package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepo.LoginPageObjectRepo;

public class LoginPage extends LoginPageObjectRepo{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean jbkLogo() {
		
		boolean status = image.isDisplayed();
		return status;

	}

	public boolean jbkheading() {
		String headingAct = heading.getText();
		String headingExp = "Java By Kiran";
		if (headingAct.equals(headingExp)) {
			return true;
		}

		else {
			return false;
		}
	}

	public boolean subHeading() {
		String subHeadingAct =subHeading.getText();
		String subHeadingExp = "JAVA | SELENIUM | PYTHON";
		if (subHeadingAct.equals(subHeadingExp))
			return true;
		else
			return false;
	}

	public boolean infoMessage() {
		String infoTextAct = signMessage.getText();
		String infoTextExp = "Sign in to start your session";
		if (infoTextAct.equals(infoTextExp))
			return true;
		else
			return false;
	}

	public boolean verifyEmailPlaceholder() {

		String emailPlaceholder =emailLogin.getAttribute("placeholder");
		String expemailPlaceholder = "Email";
		if (emailPlaceholder.equals(expemailPlaceholder))
			return true;
		else
			return false;
	}

	public boolean verifyPasswordPlaceholder() {
		String passPlaceholder =pass.getAttribute("placeholder");
		String expPassPlaceholder = "Password";
		if (passPlaceholder.equals(expPassPlaceholder))
			return true;
		else
			return false;
	}

	public boolean verifyNewMemberLink() {

		String actLinkText =newMemberLink.getText();

		String expLinkText = "Register a new membership";
		if (actLinkText.equals(expLinkText))
			return true;
		else
			return false;
	}

	public boolean verifyRegisterNewMember() {
		List<String> actListed = new ArrayList<String>();

		newMemberLink.click();

		List<WebElement> actlist = newMemberForm;

		for (WebElement list : actlist) {
			String value = list.getAttribute("placeholder");
			actListed.add(value);
		}

		List<String> expList = new ArrayList<String>();
		expList.add("Name");
		expList.add("Mobile");
		expList.add("Email");
		expList.add("Password");
		if (actListed.equals(expList))
			return true;
		else
			return false;
	}

	public boolean registerNewMember() {
		newMemberLink.click();
		name.sendKeys("Rahul Sanap");
		mobile.sendKeys("7770080146");
		email.sendKeys("rahulsanap777@gmail.com");
		pass.sendKeys("rahulsanap");
		signButton.click();
		String actAlert = driver.switchTo().alert().getText();
		String expAlert = "User registered successfully.";
		driver.switchTo().alert().accept();
		if (actAlert.equals(expAlert))
			return true;
		else
			return false;
	}
	
	public boolean validLogin() {
		emailLogin.clear();
		passLogin.clear();
		emailLogin.sendKeys("kiran@gmail.com");
		passLogin.sendKeys("123456");
		signButton.click();
		String actTitle= driver.getTitle();
		String expTitle="JavaByKiran | Dashboard";
		if(actTitle.equals(expTitle))
			return true;
		else
			return false;
	}
	
	public DashboardPage navigateToDashboardPage(WebDriver driver) {
		emailLogin.clear();
		passLogin.clear();
		emailLogin.sendKeys("kiran@gmail.com");
		passLogin.sendKeys("123456");
		signButton.click();
		return new DashboardPage(driver);
	}

}
