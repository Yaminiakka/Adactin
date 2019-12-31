package com.adactin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class ILogin_stepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user enter application url$")
	public void user_enter_application_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String geturl = FileReaderManager.getInstance().getCrInstance().geturl();
		getUrl(geturl);
	}	

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getLp().getUserName(), arg1);
	}
	
	@And("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		inputOnElement(pom.getLp().getPassword(), arg1);
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verify the username in the homepage$")
	public void user_verify_the_username_in_the_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getLp().getLoginBtn());
	}

}