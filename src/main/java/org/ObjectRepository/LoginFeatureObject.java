package org.ObjectRepository;

import org.cucumber.Flipkart.BaseTestClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFeatureObject extends BaseTestClass
{
	LoginFeatureObject o=PageFactory.initElements(driver, LoginFeatureObject.class);
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	private WebElement email;
	
	@FindBy(css="input[type='password']")
	private WebElement pwd;
	
	@FindBy(css="button[type='submit']>span")
	private WebElement loginClick;
	
	@FindBy(xpath="//div[text()='My Account']")
	private WebElement myAccount;

	
	
	public WebElement getMyAccount() {
		return myAccount;
	}


	public WebElement getEmail() {
		return email;
	}

	
	public WebElement getPwd() {
		return pwd;
	}

	
	public WebElement getLoginClick() {
		return loginClick;
	}

}
