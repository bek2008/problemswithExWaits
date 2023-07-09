package homeworkandgit;

import java.time.Duration;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseClass;

public class imandexwaits extends baseClass{


		
		@Test
		public void explicitwait() {
			
			driver.get("file:///C:/Users/mokhi/Downloads/waits.html");
			
			//Implicit wait:
		    // Doesn't throw "No such element exception" before the set time
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    
			//1. Delayed alert:
			driver.findElement(By.id("alert")).click();
			// We need to wait here
			explicitlyWait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();	
			}
		
		@Test
		public void textMsg() {
			driver.get("file:///C:/Users/mokhi/Downloads/waits.html");
			driver.findElement(By.id("populate-text")).click();
			String text = driver.findElement(By.id("h2")).getText();
			
			Assert.assertEquals(text, "Selenium Webdriver");
			
	}
}
