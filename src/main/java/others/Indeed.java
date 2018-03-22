package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Indeed {
	ChromeDriver driver;
	@Test
	public void indeed() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.indeed.co.in/Fresher-jobs?vjk=1e60f67738a9e84d"); 
		List<WebElement> joblinks = driver.findElementsByXPath("(//td[@id='resultsCol'])//a[@data-tn-element='jobTitle']");
		Actions newTab = new Actions(driver);
		int i =1;
		for (WebElement clcikOneByOne : joblinks) {
			for (int j = 0; j < 2; j++) {
				newTab.sendKeys(Keys.CONTROL).click(clcikOneByOne).perform();
			}
			switchToWindow(i);
			System.out.println(driver.getTitle() +"\n");
			driver.close();
			switchToWindow(0);
		}
		driver.quit();
	}

	public void switchToWindow(int index) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindowHandles);
		driver.switchTo().window(allHandles.get(index));
	}
}
