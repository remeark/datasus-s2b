package pucrs.datasus;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
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
import org.hamcrest.Matchers;

public class AppTest {

	private WebDriver driver;

	//@Test
	public void GivenInitialPageWhenFindOptionPerguntasFrequentes() {

		WebDriverWait wait = new WebDriverWait(driver, 2);
		WebElement element = driver.findElement(By.xpath(".//*[@id='navegacao-superior']/li[2]/a"));
		element.click();
		
		driver.close();
	}
	
	@Test
	public void GivenTrueWhenTestAndFindInBlankTheFirstQuestion(){
		
		WebElement element = driver.findElement(By.xpath(".//*[@id=\"accordion_menu_105\"]/li[1]/div[1]/div[2]/a"));
		element.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/sistema-integrado-de-informatizacao-de-ambiente-hospitalar";
		assertEquals(expected,actual);
		
		driver.findElement(By.xpath(".//*[@id=\"t3-content\"]/div[2]/article/header/h1"));
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
		
	}
	
	@Test
	public void GivenTrueWhenTestAndFindInBlankTheSecondQuestion() {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id=\"accordion_menu_105\"]/li[2]/div[1]/div[2]/a"));
		element.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/sistema-de-informacoes-sobre-orcamentos-publicos-em-saude";
		assertEquals(expected,actual);
		
		driver.findElement(By.xpath(".//*[@id=\"t3-content\"]/div[2]/article/header/h1"));
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}
	
	@Test
	public void GivenTrueWhenTestAndFindInBlankTheThirdQuestion() {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id=\"accordion_menu_105\"]/li[3]/div/div[2]/a"));
		element.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/descentralizacao-do-sihsus";
		assertEquals(expected,actual);
		
		driver.findElement(By.xpath(".//*[@id=\"t3-content\"]/div[2]/article/header/h1"));
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}
	
	@Test
	public void GivenTrueWhenTestAndFindInBlankTheFourthQuestion() {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id=\"accordion_menu_105\"]/li[4]/div/div[2]/a"));
		element.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/cadastro-nacional-de-estabelecimentos-de-saude";
		assertEquals(expected,actual);
		
		driver.findElement(By.xpath(".//*[@id=\"t3-content\"]/div[2]/article/header/h1"));
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}
	
	@Test
	public void GivenTrueWhenTestAndFindInBlankTheFifthQuestion() {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id=\"accordion_menu_105\"]/li[5]/div/div[2]/a"));
		element.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/cadastro-nacional";
		assertEquals(expected,actual);
		
		driver.findElement(By.xpath(".//*[@id=\"t3-content\"]/div[2]/article/header/h1"));
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}
	
	@Test
	public void GivenTrueWhenTestAndFindInBlankTheSixQuestion() {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id=\"accordion_menu_105\"]/li[6]/div/div[2]/a"));
		element.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://datasus.saude.gov.br/sistema-de-informacoes-do-programa-nacional-de-imunizacoes";
		assertEquals(expected,actual);
		
		driver.findElement(By.xpath(".//*[@id=\"t3-content\"]/div[2]/article/header/h1"));
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}
	
	@BeforeClass
	static public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Marinho/chromedriver_win32/chromedriver.exe");
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
