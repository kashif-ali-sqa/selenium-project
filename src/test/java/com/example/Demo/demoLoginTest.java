package com.example.Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectpack.demoLoginLocators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
public class demoLoginTest {
@Test
	public void demoLoginTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		demoLoginLocators locators = new demoLoginLocators(driver);
		locators.emailField().sendKeys("f16-bsse-071@lgu.edu.pk");
		locators.passwordField().sendKeys("Tkxel123@");
		locators.btnLogin().click();
		
		
		
	}

}
