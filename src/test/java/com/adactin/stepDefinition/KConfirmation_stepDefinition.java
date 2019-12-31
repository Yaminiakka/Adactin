package com.adactin.stepDefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.ConfirmationPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KConfirmation_stepDefinition extends BaseClass {

	public static PageObjectManager pom=new PageObjectManager(driver);
	
	@When("^user click select radio button$")
	public void user_click_select_radio_button() throws Throwable {
		clickOnElement(pom.getCp().getSelect());

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user click contiue button$")
	public void user_click_contiue_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getCp().getContinue1());
		Thread.sleep(2000);
	}

}