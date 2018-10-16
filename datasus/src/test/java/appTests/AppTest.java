package appTests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.hamcrest.Matchers;

@RunWith(JUnitParamsRunner.class)
public class AppTest {

	private WebDriver driver;
	
	@FileParameters("Roteiro de testes - csv datasusss.csv")
	@Test
	public void GivenTrueWhenTestAndFindBlank(String clique, String site, String blank) {
		click(clique);
		urlTest(site);
		blankTest(blank);

	}
	
	public void click(String xpath) {
		WebElement element = driver.findElement(By.cssSelector(xpath));
		element.click();
		
	}
	
	public void blankTest(String pagestring) {
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}
	
	public void urlTest(String url) {
		String expected = url;
		String actual = driver.getCurrentUrl();
		assertEquals(actual, expected);
	}
	
	@BeforeClass
	static public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/marinho.almeida/chromedriver_win32/chromedriver.exe");
	}

	@Before
	public void setupTest() {
		driver = new ChromeDriver();
		String InitialPage = "http://datasus.saude.gov.br/perguntas-frequentes";
		driver.get(InitialPage);

	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
