package objectpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoLoginLocators {
	WebDriver driver;

	public demoLoginLocators(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(css = "input[value='Login']")
	private WebElement btnLogin;

	public WebElement emailField() {

		return emailField;
	}

	public WebElement passwordField() {

		return passwordField;
	}

	public WebElement btnLogin() {

		return btnLogin;
	}

}
