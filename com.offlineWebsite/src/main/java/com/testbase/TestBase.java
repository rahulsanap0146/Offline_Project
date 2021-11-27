package com.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jbk.pages.LoginPage;

public class TestBase {
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(TestBase.class);

	public WebDriver webdriverInitialsation() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Maximizing the browser window");
		log.info("read property value from file");
		driver.get(readProperty("url"));
		log.info("Applying waits to browser");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closebrowser(){
		driver.close();
	}
	

	public String readProperty(String key) {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			log.info("reading property value from file");
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
		} catch (FileNotFoundException e) {
			log.error("File is not found");
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public LoginPage loadLoginPage(){
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

}
