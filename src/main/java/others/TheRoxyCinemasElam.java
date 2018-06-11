package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TheRoxyCinemasElam {
	ChromeDriver driver;
	Actions act;

	@Test
	public void dev() throws InterruptedException {	

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://www.theroxycinemas.com/");
		driver.findElementById("onesignal-popover-cancel-button").click();
		System.out.println(driver.getCurrentUrl());
		WebElement shapeOfWater = driver.findElementByXPath("(//section[@class='rc-moviethumb'])[1]");
		mouseMove(shapeOfWater);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='btn-movie-icon'])[1]")));
		WebElement booknow = driver.findElementByXPath("(//i[@class='btn-movie-icon'])[1]");
		mouseClick(booknow);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		WebElement time = driver.findElementByXPath("(//h3[text()='GOLD PLUS']/following::section//span[@class='mshowtime'])[1]");
		mouseClick(time);
		WebElement skip = driver.findElementByLinkText("SKIP");
		wait.until(ExpectedConditions.visibilityOf(skip));
		mouseClick(skip);
		//Loading img
		wait.until(ExpectedConditions.invisibilityOf(driver.findElementByXPath("(//img[@class='img-responsive'])[1]")));
		WebElement seat = driver.findElementByXPath("(//li[@class='rc-availableseat'])[1]");
		wait.until(ExpectedConditions.visibilityOf(seat));
		mouseClick(seat);;
		WebElement seatSelected = driver.findElementById("view-selectedseat");
		wait.until(ExpectedConditions.visibilityOf(seatSelected));
		System.out.println(seat.getTagName());
		WebElement next = driver.findElementByClassName("next");
		mouseClick(next);




	}

	private void mouseClick(WebElement ele) {
		act  = new Actions(driver);
		act.moveToElement(ele).pause(2000).click().perform();
	}
	private void mouseMove(WebElement ele) {
		act  = new Actions(driver);
		act.moveToElement(ele).perform();
	}
}
