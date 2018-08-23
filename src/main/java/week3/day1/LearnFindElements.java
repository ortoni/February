package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFindElements {
	@Test(invocationCount = 2,/* threadPoolSize = 2,*/ 
			invocationTimeOut = 10000)
	public void  learnFindElements() {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.crystalcruises.com/cruises/calendar?year=2018");
		List<WebElement> allQuote =
				driver.findElementsByLinkText
				("Request A Quote".toUpperCase());
		System.out.println(allQuote.size());
		allQuote.get(0).click();
		for (WebElement qu : allQuote) {
			System.out.println(qu.getText());
		}
	}
}








