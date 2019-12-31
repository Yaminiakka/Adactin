package com.adactin.stepDefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.PaymentPage;

import cucumber.api.java.en.*;

public class LPaymentstepDefinition extends BaseClass {

	public static PageObjectManager pom=new PageObjectManager(driver);
	
	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		inputOnElement(pom.getPp().getFirstname(),"KARTHIK");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		inputOnElement(pom.getPp().getLastname(),"N");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter address$")
	public void user_enter_address() throws Throwable {
		inputOnElement(pom.getPp().getBillingadd(), "MADURAI");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter creditcardno$")
	public void user_enter_creditcardno() throws Throwable {
		inputOnElement(pom.getPp().getCcno(), "9867543265174823");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter creditcardtype$")
	public void user_enter_creditcardtype() throws Throwable {
		dropDown(pom.getPp().getCctype(), "text", "American Express");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter expmon ofcreditcard$")
	public void user_enter_expmon_ofcreditcard() throws Throwable {
		dropDown(pom.getPp().getExpirymonth(), "text", "January");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter expyear ofcreditcard$")
	public void user_enter_expyear_ofcreditcard() throws Throwable {
		dropDown(pom.getPp().getExpiryyear(), "text", "2020");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter cvv$")
	public void user_enter_cvv() throws Throwable {
		inputOnElement(pom.getPp().getCvvno(), "234");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user enter booknow button$")
	public void user_enter_booknow_button() throws Throwable {
		clickOnElement(pom.getPp().getBooknow());
		Thread.sleep(6000);
		// Write code here that turns the phrase above into concrete actions

	}
	
	@Then("^user click logout in the paymentpage$")
	public void user_click_logout_in_the_paymentpage() throws Throwable {
		clickOnElement(pom.getPp().getLogout());
		// Write code here that turns the phrase above into concrete actions

	}
	
}
