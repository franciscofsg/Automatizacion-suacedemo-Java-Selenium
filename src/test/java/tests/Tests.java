package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helpers.Helpers;
import pages.PageLogin;

public class Tests {

	// Creamos un objeto de tipo WebDriver
	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		// Declaramos el objeto driver de tipo Chromedriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		Helpers helper = new Helpers();
		helper.pausa(5);
	}

	@Test
	public void pruebaUno() {

		PageLogin obj = new PageLogin(driver);

		obj.login("standard_user", "secret_sauce");

		Helpers helper = new Helpers();
		helper.pausa(5);

	}

	@Test
	public void pruebaDos() {

		PageLogin obj = new PageLogin(driver);

		obj.login("locked_out_user", "secret_sauce");

		Helpers helper = new Helpers();
		helper.pausa(5);

	}

	@After
	public void tearDown() {

		driver.quit();

	}
}
