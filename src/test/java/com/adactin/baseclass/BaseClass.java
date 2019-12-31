package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
		
			public static WebDriver driver;

			public static WebDriver BrowserLaunch(String browsername) {

				if (browsername.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				}else if(browsername.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Driver\\GeckoDriver.exe");
					driver = new FirefoxDriver();
				}else if(browsername.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}else {
					System.out.println("Invalid Browser Name");
				}
				
				driver.manage().window().maximize();
				return driver;
			}

			public static void getUrl(String url) {
				driver.get(url);
			}

			public static void dropDown(WebElement element, String option, String value) {
				
				Select s = new Select(element);
				try {
					if (option.equals("index")) {
						s.selectByIndex(Integer.parseInt(value));
					} else if (option.equals("value")) {
						s.selectByValue(value);
					} else if (option.equals("text")) {
						s.selectByVisibleText(value);
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
			public static void inputOnElement(WebElement element, String value) {
				element.sendKeys(value);
			}
			
			public static void scrollDown(WebElement element){
							
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
				
			}
			
			public static void scrollUp(){
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,-1000)");
				
			}
			public static void alert(WebElement element,WebElement element1) throws Exception{
				
				element.click();
				Thread.sleep(2000);
				
				//element1.click();
			//	Thread.sleep(3000);
				
				Alert alert = driver.switchTo().alert();
				alert.accept();
				Thread.sleep(2000);
				
				}
			
			public static void alertdis(WebElement element,WebElement element1) throws Exception{
				
				element.click();
				Thread.sleep(2000);
				
				element1.click();
				Thread.sleep(3000);
				
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
				Thread.sleep(2000);
			}
			
			public static void alerttext(WebElement element,WebElement element1) throws Exception{
				
				element.click();
				Thread.sleep(2000);
				
				element1.click();
				Thread.sleep(3000);
				
				Alert alert = driver.switchTo().alert();
				alert.sendKeys("Karthick");
				alert.accept();
				
			}
			public static void robot() throws Exception {
			       
				Robot r=new Robot();
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			
			}
			
			public static void actionsrc(WebElement element,WebElement source,WebElement target){
				
			Actions ac=new Actions(driver);
			if(ac.contextClick(element).equals(true)) {
				ac.contextClick(element).build().perform();
		    	}else if(ac.doubleClick(element).equals(true)) {
		    		ac.doubleClick(element).build().perform();
		    	}else if(ac.dragAndDrop(source, target).equals(true)) {
		    		ac.dragAndDrop(source, target).build().perform();
		    	}else if(ac.moveToElement(target).equals(true)) {
		    		ac.moveToElement(target).build().perform();
		    	}else {
		    		System.out.println("Invalid action performed");
		    	}
			}
			
			public static void iframes(WebElement element,WebElement element1,WebElement element2) throws Exception{
				
				element.click();
				Thread.sleep(2000);
				
				driver.switchTo().frame(element1);
				element2.sendKeys("karthi");
				
			}
			
			public static void navigateTo(WebElement url) {
				driver.navigate().to("url");
			}
			
			public static void navigateBack(WebElement element) {
				driver.navigate().back();
				}

			public static void navigateForward(WebElement element) {
				driver.navigate().forward();
			}

			public static void navigateRefresh(WebElement element) {
				driver.navigate().refresh();
			}
			public static void clickOnElement(WebElement element) {
				element.click();
			}

			public static void clearTheElement(WebElement element) {
				element.clear();
			}
			public static void driverQuit(WebElement element) {
				driver.quit();
				
			}
			
			public static void isEnabled(WebElement element) {
				if(element.isEnabled()) {
					System.out.println("Element is editable");
				}
			}
			
			public static void isDisplayed(WebElement element) {
				if(element.isDisplayed()) {
					System.out.println("Element is viewable");
				}
			}
			
			public static void isSelected(WebElement element) {
				if(element.isSelected()) {
					System.out.println("Element is choosen");
				}
			}
			public static void takeScreenshot(String id) throws IOException {
				TakesScreenshot ts=(TakesScreenshot) driver;
				File sourcefile = ts.getScreenshotAs(OutputType.FILE);
				takeScreenshot(id);
				File destFile= new File("C:\\Users\\Sr GM\\eclipse-workspace\\SeleniumProject\\Screenshot\\test.png");
				FileUtils.copyFile(sourcefile, destFile);
			}

			

	}


