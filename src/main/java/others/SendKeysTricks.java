package others;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysTricks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager",
				/*Keys.TAB, "crmsfa", Keys.TAB, Keys.ENTER*/
				Keys.CONTROL, "a", Keys.BACK_SPACE);
		//driver.getKeyboard().sendKeys(Keys.CONTROL, "p");
	}

}
