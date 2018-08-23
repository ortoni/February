package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement eleElec = driver.findElementByXPath("//span[text()='Electronics']");
		//WebElement eleOppo = driver.findElementByXPath("//a[text()='OPPO']");
		Actions builder = new Actions(driver);
	//	Action
		builder.moveToElement(eleElec).perform();
	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//a[text()='OP']"))).click();
		
		driver.findElement(By.id("")).sendKeys(Keys.UP);;
		
		
	}

}







