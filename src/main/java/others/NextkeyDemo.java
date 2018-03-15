package others;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NextkeyDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElementById("username").sendKeys("DemoSalesManager",
				Keys.TAB, "crmsfa", Keys.TAB, Keys.ENTER);
		driver.findElementByLinkText("CRM/SFA").click();;
		driver.findElementByLinkText("Leads").click();;
		driver.findElementByLinkText("Find Leads").click();
		/*String color = nextButton.getCssValue("color");
	System.out.println(nextButton.getCssValue("color"));*/
		WebElement nextButton = driver.findElementByXPath("(//em[@unselectable='on'])[10]/button");
	//	String cssValue= nextButton.getCssValue("color");
		do {
		nextButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='One Moment...']")));
	}while(driver.findElementByXPath("(//em[@unselectable='on'])[10]/button").isEnabled());
		 
		driver.close();
	}

}
