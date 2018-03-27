package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bank {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElementByXPath("//p[text()='Custom quote']").click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@class='sprite-gender icon-gender-male']"))).click();
	//	Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[@class='sprite-city icon-city-chennai']"))).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//input[@type='text' and @name='form.applicantPlaceHolder.companyName']"))).sendKeys("testleaf", Keys.ENTER);
	//	Thread.sleep(4000);
		
		WebElement slider = driver.findElementByXPath("(//div[@class='slider-track']/following::div[@class='tooltip-arrow'][1])[2]");
		System.out.println("Initial x and y");
		int x = slider.getLocation().getX();
		System.out.println("x = "+x);
		int y = slider.getLocation().getY();
		System.out.println("y = "+y);	
		String text = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText();
		System.out.println("initial amount = "+text);
		String text2="";
		int x2 =x+1;
		Actions act = new Actions(driver);
		do {
			act.clickAndHold(slider).moveByOffset(x2, y).release().perform();
			text2 = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText();
			System.out.println("After sliding amount = "+text2);
			WebElement newS = driver.findElementByXPath("(//div[@class='slider-track']/following::div[@class='tooltip-arrow'][1])[2]");
			System.out.println("after sliding location = "+newS.getLocation());
			int x3 = newS.getLocation().getX();
			x2 = x3;
		} while (!text2.contains("80000"));
		//x++;
		//text2=text;
		//act.clickAndHold(slider).moveByOffset(x, 800).release().perform();
		Thread.sleep(3000);
		System.out.println("after compl");
		System.out.println(driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]").getText());
		x = slider.getLocation().getX();
		System.out.println(x);
		y = slider.getLocation().getY();
		System.out.println(y);
				
	}

} 