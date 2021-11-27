package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepo.DownloadPageObjectRepo;

public class DownloadPage  extends DownloadPageObjectRepo{

	WebDriver driver;
	public DownloadPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verify32bBitList(){
		List<WebElement>webList= bit32List;
		
		List<WebElement>webList1= vendorList;
		
		ArrayList<String> actList= new ArrayList<String>();
		int a=0;
		for(WebElement list:webList){
			if(list.getText().contains("32bit")){
				String text=webList1.get(a).getText();
				actList.add(text);
				
			}
			a++;
		}
		System.out.println(actList);
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("Java Development Kit (JDK)");
		expList.add("Selenium Server Standalon Jar");
		expList.add("Selenium Server Source Jar");
		expList.add("Google Chrome");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}
	
	}
	
	public boolean verifyVersionOf32Bit(){
		List<WebElement>webList= bit32List1;
		
		ArrayList<String> actList= new ArrayList<String>();
		int count =webList.size();
		System.out.println(count);
		
		for(WebElement list:webList){
			String text=list.getText();
			actList.add(text);
		}
		System.out.println(actList);
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("1.8");
		expList.add("76.0");
		expList.add("69.0");
		expList.add("0.24.0");

		if (actList.equals(expList)) {
			System.out.println("Test case is passed");
			return true;
		} else {
			System.out.println("Test case is failed");
			return false;
		}
	}
	
	public boolean verifyGoogleOfficialWebsite(){
		
		String mainWind = driver.getWindowHandle();
		System.out.println(mainWind);
		List<WebElement>webList=googleWebsite;
		
		for(WebElement link:webList){
			link.click();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
		}
		List<String>actList = new ArrayList<String>();
		Set<String> allWind=driver.getWindowHandles();
		
		for(String window: allWind){
			driver.switchTo().window(window);
			
			System.out.println("Title of window is : " + driver.getTitle());

			String url=driver.getCurrentUrl();
			System.out.println(url);
			actList.add(url);
			
			if (!mainWind.equals(window))
				driver.close();
		}
		
		List<String>expList= new ArrayList<String>();
		expList.add("file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/downloads.html");
		expList.add("https://chromedriver.chromium.org/downloads");
		expList.add("https://chromeenterprise.google/browser/download/#windows-tab");

		if(actList.equals(expList))
			return true;
		else 
			return false;
		
	}
	
}
