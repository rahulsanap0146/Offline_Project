package com.jbk.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageObjectRepo {

		@FindBy(xpath="//button[text()='Add User']")
		public WebElement addUserBtn;
		
		@FindBy(xpath="//label[@for]")
		public List<WebElement> inputLabel;
		
		@FindBy(xpath="//input[@placeholder='Username']")
		public WebElement username;
		
		@FindBy(xpath="//input[@placeholder='Mobile']")
		public WebElement mobile;
		
		@FindBy(xpath="//input[@placeholder='Email']")
		public WebElement email;
		
		@FindBy(xpath="//input[@placeholder='Java/J2EE']")
		public WebElement course;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		public WebElement password;
		
		@FindBy(xpath="//input[@value='Male']")
		public WebElement gender;
		
		@FindBy(xpath="//select")
		public WebElement state;
		
		@FindBy(xpath="//input[@placeholder='FriendMobile']")
		public WebElement friendMble;
		
		@FindBy(xpath="//button")
		public WebElement submitBtn;
		
		@FindBy(xpath="//th")
		public List<WebElement> tableHeading;
		
		@FindBy(xpath="//td[text()='Maharashtra']")
		public List<WebElement> mahaState;
		
		@FindBy(xpath="//th//following::tr")
		public List<WebElement>userList;
		
		@FindBy(xpath="//span[@class='label label-danger ss']")
		public WebElement deleteBtn;
		
		@FindBy(xpath="//option")
		public List<WebElement> stateList;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
