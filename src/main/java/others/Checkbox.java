package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Checkbox {
	@Test
	public void dev() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.way2automation.com/angularjs-protractor/checkboxes/");
		driver.findElementByXPath("(//h4[@class=\"ng-binding\"])[1]").click();
		driver.findElementByXPath("(//h4[@class=\"ng-binding\"])[3]").click();
	}
}
