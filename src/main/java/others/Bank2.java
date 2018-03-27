package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bank2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElementByXPath("//p[text()='Custom quote']").click();
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElementByXPath("//*[@class='sprite-gender icon-gender-male']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElementByXPath("//*[@class='sprite-city icon-city-chennai']"))).click();
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElementByXPath("//input[@type='text' and @name='form.applicantPlaceHolder.companyName']")))
		.sendKeys("testleaf", Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement slider = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]");
		System.out.println("Initial x and y");
		int x = slider.getLocation().getX();
		System.out.println("x = "+x);
		System.out.println("x = "+(x+2));
		int y = slider.getLocation().getY();
		System.out.println("y = "+y);	
		String text = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText();
		System.out.println("initial amount = "+text);
		Actions act = new Actions(driver);
		int parseInt ;
		do {
			act.clickAndHold(slider).moveByOffset(x, y).release().perform();
		//	Thread.sleep(3000);
			System.out.println("After Slided");
			String newAmount = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText();
			String am = newAmount.replaceAll("\\D+", "");
			parseInt = Integer.parseInt(am);
			System.out.println(Integer.parseInt(am));
		} while (!(parseInt >= 53000));
		x = slider.getLocation().getX();
		System.out.println(x);
		y = slider.getLocation().getY();
		System.out.println(y);
		driver.quit();

	}

} 