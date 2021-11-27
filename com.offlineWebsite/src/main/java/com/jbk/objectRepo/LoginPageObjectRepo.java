package com.jbk.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepo {

	@FindBy(xpath = "//img")
	public WebElement image;

	@FindBy(xpath = "//b[text()='Java By Kiran']")
	public WebElement heading;

	@FindBy(xpath = "//h4[text()='JAVA | SELENIUM | PYTHON']")
	public WebElement subHeading;

	@FindBy(xpath = "//p")
	public WebElement signMessage;

	@FindBy(css = "input.form-control[id=email]")
	public WebElement emailLogin;

	@FindBy(id = "password")
	public WebElement passLogin;

	@FindBy(css = "a.text-center")
	public WebElement newMemberLink;

	@FindBy(xpath = "//input")
	public List<WebElement> newMemberForm;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement name;

	@FindBy(xpath = "//input[@id='mobile']")
	public WebElement mobile;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement pass;

	@FindBy(xpath = "//button")
	public WebElement signButton;

}
