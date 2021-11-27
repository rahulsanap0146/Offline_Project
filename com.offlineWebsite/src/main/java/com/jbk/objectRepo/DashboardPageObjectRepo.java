package com.jbk.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjectRepo {


	@FindBy(xpath="//h3")
	public List<WebElement> course;
	
	@FindBy(xpath="//h3//following::p")
	public List<WebElement> profile;
	
	@FindBy(xpath="//img")
	public WebElement image;
	
	@FindBy(xpath="//ul//following::li//following::a//following::span")
	public List<WebElement> menu;
	
	@FindBy(xpath="//a[@class='small-box-footer']")
	public List<WebElement>moreInfo;
	
	@FindBy(xpath="//ol//following::li//a[@href='#']")
	public WebElement homeLink;
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement logoutBtn;
	
	@FindBy(xpath="//a//following::span[text()='Users']")
	public WebElement userBtn;
	
	@FindBy(xpath="//a//following::span[text()='Operators']")
	public WebElement operatorButton;
	
	@FindBy(xpath="//a//following::span[text()='     Useful Links']")
	public WebElement usefulLinkBtn;
	
	@FindBy(xpath="//a//following::span[text()='Downloads']")
	public WebElement downloadBtn;
	
	@FindBy(xpath="//a//following::span[text()='Logout']")
	public WebElement logoutLinkBtn;
	
	
}
