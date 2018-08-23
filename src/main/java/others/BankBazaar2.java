package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankBazaar2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElementByXPath("//p[text()='Custom quote']").click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElementByXPath("//*[@class='sprite-gender icon-gender-male']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElementByXPath("//*[@class='sprite-city icon-city-chennai']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElementByXPath("//input[@type='text' and @name='form.applicantPlaceHolder.companyName']")))
		.sendKeys("TestLeaf", Keys.ENTER);
		WebElement slider = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]");
		wait.until(ExpectedConditions.visibilityOf(slider));
		String text = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText();
		System.out.println("Initial Amount = "+text);
		Actions act = new Actions(driver);
		String reqAm = "14,000";
		String newAmount; 
		do {
			act.clickAndHold(slider).moveByOffset(5, slider.getLocation().getY()).release().perform();
			WebElement am = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]");
			newAmount = am.getText();
		} while (!newAmount.equals(reqAm));
		System.out.println("After Sliding");
		System.out.println(driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText());
		Thread.sleep(5000);
		//driver.quit();
	}
} 