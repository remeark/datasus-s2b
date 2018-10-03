package pucrs.datasus;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {

	private WebDriver driver;

	@Test
	public void GivenInitialPageWhenFindOptionSearchWord() {

		String id = "mod-search-searchword";
		WebDriverWait wait = new WebDriverWait(driver, 2);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));

		// assertNotNull(element);

		// page.atoz.click();

		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/";
		assertEquals(expected, actual);
		driver.close();
	}

	@BeforeClass
	static public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Marinho/chromedriver_win32/chromedriver.exe");
	}

	@Before
	public void setupTest() {
		driver = new ChromeDriver();
		String InitialPage = "http://datasus.saude.gov.br/";
		driver.get(InitialPage);

	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
