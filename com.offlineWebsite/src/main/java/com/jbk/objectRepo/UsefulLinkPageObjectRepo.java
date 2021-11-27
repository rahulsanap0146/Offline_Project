package com.jbk.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinkPageObjectRepo {
	
	@FindBy(xpath="//tr//td[3]//span")
	public List<WebElement> linkList;
	
	
}
