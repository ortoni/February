package alertAuthenticate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetGearAuthenticate {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.1");
		Thread.sleep(3000);
		//Alert alt = dri
				Alert alert = driver.switchTo().alert();
		driver.switchTo().activeElement().sendKeys("admin", Keys.TAB);;
		driver.switchTo().activeElement().sendKeys("password");
	}

}
