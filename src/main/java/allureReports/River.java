package allureReports;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class River {
	ChromeDriver driver;
	Actions act ;
	WebDriverWait wait;

	@Test	
	public void main() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.riverisland.com/");
		//Accept cookies
		try {
			driver.findElementByLinkText("Continue").click();

		} catch (Exception e) {
			System.out.println("Cookies not shown");
		}


		//mouse over on men
		WebElement men = driver.findElementByLinkText("Men");
		waitUnitiVisible(men);
		mouseMove(men);
		//Clicking on Tops
		WebElement tops = driver.findElementByLinkText("Tops");
		waitUnitiVisible(tops);
		mouseClick(tops);
		//Filtering shirts
		WebElement shirts = driver.findElementByXPath("//p[text()='Shirts']/preceding::span[@class='icon-checkbox'][1]");
		waitUnitiVisible(shirts);
		shirts.click();
		
		//Checking filter by shirts names
		List<WebElement> allShirts = driver.findElementsByXPath("//div[@class='name ui-body-text']");
		waitUnitiVisible(allShirts);
		for (WebElement names : allShirts) {
			boolean contains = names.getText().contains("shirt");
			if(contains==true) {
				
			}else {
				System.out.println("Filter not applied");
			}
		}

		// Checking whether shirts filtered is applied by verifying current url
		String urlShirt = driver.getCurrentUrl();
		System.out.println(urlShirt);
		
		
		if(urlShirt.contains("cat=shirts")) {
			System.out.println("Filter is applied successfully");
		}else {
			System.out.println("Filter not applied");
		}
	}
	public void mouseClick(WebElement ele) {
		act  = new Actions(driver);
		act.moveToElement(ele).pause(1000).click().perform();
	}
	public void mouseMove(WebElement ele) {
		act  = new Actions(driver);
		act.moveToElement(ele).pause(500).perform();
	}

	public void waitUnitiVisible(WebElement element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitUnitiVisible(List<WebElement> element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

}
