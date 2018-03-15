package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TheRoxyCinemas {
	@Test
	public void dev() throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(op);
		System.out.println("browser launched");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://www.theroxycinemas.com/");
		driver.findElementById("onesignal-popover-cancel-button").click();
		System.out.println(driver.getCurrentUrl());
		WebElement shapeOfWater = driver.findElementByXPath("(//section[@class='rc-moviethumb'])[1]");
		Actions act = new Actions(driver);
		act.moveToElement(shapeOfWater).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='btn-movie-icon'])[1]")));
		WebElement booknow = driver.findElementByXPath("(//i[@class='btn-movie-icon'])[1]");
		act.click(booknow).perform();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		


	}
}
