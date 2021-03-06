package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.ConfirmationPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.PaymentPage;
import com.adactin.pom.SearchHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	private PaymentPage pp;
	private SearchHotel sh;
	private ConfirmationPage cp;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}

	public PaymentPage getPp() {
		pp=new PaymentPage(driver);
		return pp;
	}

	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}

	public ConfirmationPage getCp() {
		cp=new ConfirmationPage(driver);
		return cp;
	}
	
	

}
