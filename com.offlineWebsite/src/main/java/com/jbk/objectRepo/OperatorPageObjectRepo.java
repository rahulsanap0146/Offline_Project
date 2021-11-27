package com.jbk.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPageObjectRepo {

	@FindBy(xpath = "//tr//td[4]//following::span[@class='label label-danger']")
	public List<WebElement> email;

	@FindBy(xpath = "//tr//td[4]//following::span[@class='label label-info']")
	public List<WebElement> phone;

	@FindBy(xpath = "//tr//td[4]//following::span[text()='SMS']")
	public List<WebElement> sms;
	
	@FindBy(xpath="//tr//td[2]")
	public List<WebElement>personList;
	
	@FindBy(xpath="//tr//td[4]")
	public List<WebElement>wayOfConnectList;
	
	@FindBy(xpath="//tr//td[3]")
	public List<WebElement>forList;
	
	@FindBy(xpath="//tr//td[6]")
	public List<WebElement>timingList;
	
	
}
