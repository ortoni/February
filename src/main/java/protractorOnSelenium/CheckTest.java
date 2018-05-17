package protractorOnSelenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckTest {

	ChromeDriver driver;
	@Test
	public void main() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://cafetownsend-angular-rails.herokuapp.com");
		driver.findElementByXPath("(//input)[1]").sendKeys("Luke");
		driver.findElementByXPath("(//input)[2]").sendKeys("Skywalker", Keys.ENTER);
		driver.findElementByLinkText("Create").click();
		driver.findElementByXPath("//span[text()='First name:']/following-sibling::input").sendKeys("koushik");

		driver.findElementByXPath("//span[text()='Last name:']/following-sibling::input").sendKeys("koushik");
		driver.findElementByXPath("//span[text()='Start date:']/following-sibling::input").sendKeys("2011-01-23");
		driver.findElementByXPath("//span[text()='Email:']/following-sibling::input").sendKeys("ko@test.com");

		driver.findElementByXPath("//button[text()='Add']").click();

		List<WebElement> nameList = driver.findElementsByXPath("//ul[@id='employee-list']/li");
		System.out.println(nameList.size());
		for (WebElement names : nameList) {
			System.out.println(names.getText());
		}
	}

}
