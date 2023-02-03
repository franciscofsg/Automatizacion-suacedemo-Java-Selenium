package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {

	// WebDriver es el nucleo de selenium
	private WebDriver driver;
	private By userField;
	private By passwordField;
	private By loginButton;

	// constructor de clase
	public PageLogin(WebDriver driver) {

		this.driver = driver;

		userField = By.name("user-name");
		passwordField = By.name("password");
		loginButton = By.name("login-button");

	}

	public void login(String user, String pass) {

		driver.findElement(userField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(loginButton).click();
		Helpers helper = new Helpers();
		helper.pausa(4);

	}

}
