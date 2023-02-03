package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogon {

	private WebDriver driver;
	private By contentText;

	public PageLogon(WebDriver driver) {
		this.driver = driver;
		contentText = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
	}

	public void assertLogonPage() {

		Assert.assertTrue(

				driver.findElement(contentText).getText()
						.contains("Epic sadface: Sorry, this user has been locked out."));

	}
}
