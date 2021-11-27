package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepo.UsefulLinkPageObjectRepo;

public class UsefulLinkPage extends UsefulLinkPageObjectRepo {
	WebDriver driver;

	public UsefulLinkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyLinksURL() {
		String mainWind = driver.getWindowHandle();
		System.out.println(mainWind);
		List<WebElement> webList = linkList;
		for (WebElement text : webList) {
			text.click();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}
		List<String>actList = new ArrayList<String>();
		Set<String> allWind = driver.getWindowHandles();

		for (String window : allWind) {

			//System.out.println("Id of Window is: " + window);

			driver.switchTo().window(window);

			System.out.println("Title of window is : " + driver.getTitle());

			String url=driver.getCurrentUrl();
			System.out.println(url);
			actList.add(url);
			
			if (window.equals(mainWind))
				driver.close();
		}
		
		List<String>expList= new ArrayList<String>();
		expList.add("file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/links.html");
		expList.add("https://javabykiran.com/placement/");
		expList.add("https://javabykiran.com/courses");
		expList.add("https://javabykiran.com/core-java-interview-question-answer");
		expList.add("https://javabykiran.com/selenium-testing-interview-question-answer");
		expList.add("https://javabykiran.com/java-by-kiran-videos/");
		expList.add("https://javabykiran.com/news");

		if(actList.equals(expList))
			return true;
		else 
			return false;
		
	}
}









