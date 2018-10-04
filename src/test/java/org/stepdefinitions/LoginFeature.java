package org.stepdefinitions;

import org.ObjectRepository.LoginFeatureObject;
import org.cucumber.Flipkart.BaseTestClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class LoginFeature extends BaseTestClass
{
	public static WebDriver driver;
	BaseTestClass base=new BaseTestClass();
	//LoginFeatureObject loginObject = new LoginFeatureObject();
	@Given("^User login to application url$")
	public void user_login_to_application_url() {
	   
		base.beforeClass();
	}

	/*@When("^User enters correct username and password$")
	public void user_enters_correct_username_and_password(DataTable arg1) throws Throwable {
		
		List<String> data = arg1.asList(String.class);
		base.windowHandle();
		base.sendText(loginObject.getEmail(), data.get(0));
		base.sendText(loginObject.getPwd(), data.get(1));
		base.btnClick(loginObject.getLoginClick());
	}
	@Then("^User verfies if login is possible$")
	public void user_verfies_if_login_is_possible() throws Throwable {
	    Assert.assertTrue(loginObject.getMyAccount().isDisplayed());
	}*/
}
