package com.adactin.stepDefinition;

import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SearchHotel;

import cucumber.api.java.en.*;

public class JSearch_stepDefinition extends BaseClass{
	
	public static PageObjectManager pom=new PageObjectManager(driver);
	
		
	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
	    dropDown(pom.getSh().getLocation(),"text","London");
	    Thread.sleep(3000);

	    
	}

	@When("^user select the hotels$")
	public void user_select_the_hotels() throws Throwable {
		
		dropDown(pom.getSh().getHotel(),"text","Hotel Creek");
	}
		

	@When("^user select roomtype$")
	public void user_select_roomtype() throws Throwable {
		
		dropDown(pom.getSh().getRoomType(),"text","Super Deluxe");
	    
	    
	}

	@When("^user select roomno$")
	public void user_select_roomno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		dropDown(pom.getSh().getNoofrooms(),"text","4 - Four");
	}


	@Then("^user click submitbutton$")
	public void user_click_submitbutton() throws Throwable {
		
		clickOnElement(pom.getSh().getSearch());
	    
	    }
}
