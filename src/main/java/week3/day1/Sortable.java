package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sortable {
	@Test(expectedExceptions 
			= NoSuchFrameException.class)
	public  void main() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(1);
		WebElement ele1 = 
				driver.findElementByXPath("//li[text()='Item 1']");
		WebElement ele2 = 
				driver.findElementByXPath("//li[text()='Item 4']");
		Actions builder = new Actions(driver);
		int y = ele2.getLocation().getY();
		builder
		.dragAndDropBy(ele1, 0, y)
		.release()
		.perform();
	}

}






