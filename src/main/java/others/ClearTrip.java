package others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClearTrip {
	@Test
	public void dev() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//driver.findElementByXPath("(//i[@class='icon ir datePicker'])[1]").click();		
		//driver.findElementByXPath("//a[@href='/eticketing/userSignUp.jsf']").click();
	}
}
