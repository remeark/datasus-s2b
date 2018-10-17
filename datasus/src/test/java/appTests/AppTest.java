package appTests;



import org.junit.Test;
import org.junit.runner.RunWith;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import appTasks.Tasks;
import appVerificationPoints.VerificationPoints;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;

@RunWith(JUnitParamsRunner.class)
public class AppTest {

	private WebDriver driver;
	
	@FileParameters("Roteiro de testes - csv datasusss.csv")
	@Test
	public void GivenTrueWhenTestAndFindBlank(String clique, String site, String blank) {
		Tasks task = new Tasks(driver);
		VerificationPoints verify = new VerificationPoints(driver);
		task.click(clique);
		verify.blankTest(blank);
		verify.urlTest(site);

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
