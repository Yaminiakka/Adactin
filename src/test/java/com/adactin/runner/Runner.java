package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\java\\com\\adactin\\feature",
                  glue="com\\adactin\\stepDefinition",
                  plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Report/cucumber_report.html",
                		  "html:Report",
                		  "json:Report/cucumber.json",
                		  "rerun:target/FailerScenario.txt"
                		  },
                  format="pretty",
                  monochrome=true,
                  dryRun=false,
                  strict=true)
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Exception {
		String browsername= FileReaderManager.getInstance().getCrInstance().browsername();
		driver =BaseClass.BrowserLaunch(browsername);
	}
	
	@AfterClass
	public static void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();

	}

}
