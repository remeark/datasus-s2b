package appVerificationPoints;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class VerificationPoints {
	
	private WebDriver driver;
	
	public VerificationPoints(WebDriver driver) {
		this.driver=driver;
	}
	
	public void urlTest(String url) {
		String expected = url;
		String actual = driver.getCurrentUrl();
		assertEquals(actual, expected);
	}
	
	public void blankTest(String pagestring) {
		String codigoPagina = driver.getPageSource();
		assertThat(codigoPagina, Matchers.containsString("Página em branco"));
	}

}
