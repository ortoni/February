package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		//mouseover on the electronics
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).pause(2000)
		.click(driver.findElementByLinkText("OPPO")).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
