package homeworkandgit;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttry {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Downloads\\Selenium downloads\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://google.com");
	}
}
