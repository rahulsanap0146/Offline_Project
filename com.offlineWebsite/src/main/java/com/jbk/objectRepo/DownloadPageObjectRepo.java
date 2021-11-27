package com.jbk.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPageObjectRepo {

	@FindBy(xpath="//tr//td[5]//span[@class='label label-success']")
	public List<WebElement> bit32List;
	
	@FindBy(xpath="//tr//td[3]")
	public List<WebElement>vendorList;
	
	@FindBy(xpath="//tr//td[5]//span/parent::a/parent::td/preceding-sibling::td[1]")
	public List<WebElement>bit32List1;
	//xpath for 32 bit specific vendor
	// should refer
	
	@FindBy(xpath="//td[contains(text(),'Google')]/parent::tr/td[8]/a")
	public List<WebElement>googleWebsite;
	
	@FindBy(xpath="//td[contains(text(),'Selenium')]/parent::tr/td[8]/a")
	public List<WebElement>seleniumWebsite;

}
