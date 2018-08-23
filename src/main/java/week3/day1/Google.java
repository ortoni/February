package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void google() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElementByName("q")
		.sendKeys("koushik", Keys.ENTER);

		List<WebElement> names = 
				driver.findElementsByPartialLinkText
				("koushik");
		System.out.println(names.size());
		for (WebElement name : names) {
			System.out.println(name.getText());
		}
	}
}
