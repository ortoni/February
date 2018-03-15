package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dev {
	@Test
	public void dev() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://devfindgood.goodgrid.com/FindGood.TMS.Web/ws-findgood/findgood/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElementById("loginForm:username").sendKeys("Olivia.Stone@gboxz.com", 
				Keys.TAB, "password", Keys.ENTER);		
		driver.findElementByXPath("//div[text()='Conversations']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Chatrooms']")));
		driver.findElementByXPath("//div[text()='Chatrooms']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//div[@class='fg-add-calendar clickable add']").click();
		driver.findElementByXPath("//span[text()='Guests:']/following::input[1]").sendKeys("ma");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElementByXPath("//input[@placeholder='Enter a location']"));
		actions.click();
		actions.sendKeys("chennai");
		actions.build().perform();
	}
}
