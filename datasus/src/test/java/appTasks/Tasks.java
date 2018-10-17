package appTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tasks {
	
	private WebDriver driver;
	
	public Tasks(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(String xpath) {
		WebElement element = driver.findElement(By.cssSelector(xpath));
		element.click();
	}

}
