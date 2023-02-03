package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageReservation {
	private WebDriver driver;
	private By contentText;

	public PageReservation(WebDriver driver) {
		this.driver = driver;
		contentText = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

	}

	public void assertPage() {

		driver.findElement(contentText).getText()
		.contains("PRODUCTS");
		
		
	}

}
