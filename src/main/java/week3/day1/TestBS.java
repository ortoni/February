package week3.day1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestBS {
	
	
	/*public static final String USERNAME = "koushikchatterje2";
	public static final String AUTOMATE_KEY = "WDKHmT9AMKzKyz7Qsuz9";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";*/
	
	
	
	static RemoteWebDriver driver;
	
	@Test
	public void main() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("internet explorer");
		dc.setPlatform(Platform.WINDOWS);		
		driver = new RemoteWebDriver(
				new URL("http://10.0.0.13:4444/wd/hub"), dc);
//		driver = new ChromeDriver();
		try {			
			driver.get("https://dev56210.service-now.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame(0);
			driver.findElementByXPath("//input[@name='user_name']").sendKeys("admin");
			driver.findElementByXPath("//input[@type='password']").sendKeys("Tuna@123");
			driver.findElementByXPath("//button[text()='Login']").click();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			WebElement filter = driver.findElementById("filter");
			type( filter, "incident");
			WebElement createNew = driver.findElementByXPath("//div[contains(text(),'Create New')]");
			click( createNew);
			Thread.sleep(3000);
			try {
				driver.switchTo().frame("gsft_main");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			Thread.sleep(3000);

			WebElement caller = driver.findElementById("sys_display.incident.caller_id");
			type( caller, "Abel", Keys.TAB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			driver.quit();
			e.printStackTrace();
		}
	}
	WebDriverWait wait;
	private void type(WebElement ele, String text) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(text);
	}
	private void type( WebElement ele, String text, Keys key) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(text, key);
	}
	private void click( WebElement ele) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}
}
