package leaftap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log {
	@Test
	public void anontherLogin() {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager{{}}");

	}

}
