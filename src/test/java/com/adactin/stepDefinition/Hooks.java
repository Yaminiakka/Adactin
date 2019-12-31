package com.adactin.stepDefinition;

import java.io.IOException;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	 public static void  beforescenario(Scenario scenario) {
		 System.out.println("Scenario Name: "+scenario.getName());
	}
	 
	 @After
		public static void afterscenario(Scenario scenario) throws Exception{
			if (scenario.isFailed()) {
				String id = scenario.getId();
				System.out.println("Scenario id is" +id);
				takeScreenshot(id);				
			}
			System.out.println("     Status:"+scenario.getStatus());
	 }

		
	}



