package objectpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoLoginLocators {
	WebDriver driver;
	public demoLoginLocators(WebDriver driver) {
		
		this.driver = driver;
	}
	
	private By emailField = By.id("input-email");
	private By passwordField = By.id("input-password");
	private By btnLogin  = By.cssSelector("input[value='Login']");
	
	public WebElement emailField() {
		
		return driver.findElement(emailField);
	}
public WebElement passwordField() {
		
		return driver.findElement(passwordField);
	}
public WebElement btnLogin() {
	
	return driver.findElement(btnLogin);
}

}
