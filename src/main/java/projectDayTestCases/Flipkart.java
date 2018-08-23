package projectDayTestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart {
	ChromeDriver driver;
	Actions act;
	WebDriverWait wait;
	@Test
	public void flip() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement tV = driver.findElementByLinkText("TVs & Appliances");
		mouseMove(tV);
		WebElement samsung = driver.findElementByLinkText("Samsung");
		mouseClick(samsung);
		WebElement min = driver.findElementByXPath("(//select[@class='a_eCSK'])[1]");
		select(min, "25000");
		WebElement max = driver.findElementByXPath("(//select[@class='a_eCSK'])[2]");
		select(max, "50000");
		driver.findElementByXPath("//div[text()='Screen Size']").click();
		driver.findElementByXPath("//div[text()='48 - 55']/preceding::input[1]").click();
		WebElement firstLink = driver.findElementByXPath("(//div[@class='_3T_wwx']/div/div/a)[1]");
		waitUnitilVisibleAndClick(firstLink);
		
		
		driver.switchTo().defaultContent();
	}
	public void select(WebElement ele, String value) {
		new Select(ele).selectByValue(value);
	}
	
	public void mouseClick(WebElement ele) {
		act  = new Actions(driver);
		act.moveToElement(ele).pause(250).click().perform();
	}
	public void mouseMove(WebElement ele) {
		act  = new Actions(driver);
		act.moveToElement(ele).pause(250).perform();
	}

	public void waitUnitilVisible(WebElement element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitUnitilVisibleAndClick(WebElement element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element)).clear();
	}
	public void waitUnitilVisible(List<WebElement> element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void switchToWindow(int index) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindowHandles);
		driver.switchTo().window(allHandles.get(index));
	}
	public void openInNewTab(WebElement ele) {
		act = new Actions(driver);
		act.sendKeys(ele,Keys.CONTROL).click().perform();
	}
}
