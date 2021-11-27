package com.jbk.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/downloads.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		ArrayList<String> actList= new ArrayList<String>();
		List<WebElement>list=driver.findElements(By.xpath("//tr//td[5]//span/parent::a/parent::td/preceding-sibling::td[2]"));
		int a= list.size();
		System.out.println(a);
		for(WebElement web:list){
			String text=web.getText();
			actList.add(text);
		}
		System.out.println(actList);
		
		
		//td[text()='"+key+"']/parent::tr/td[8]/a")
	}

}
