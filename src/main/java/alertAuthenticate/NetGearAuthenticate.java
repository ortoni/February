package alertAuthenticate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NetGearAuthenticate {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://admin:password@192.168.1.1");
		driver.get("http://192.168.1.1/");
		//driver.executeScript("document.activeElement.focus()", "");
		//Thread.sleep(3000);
		try {
			driver.switchTo().activeElement().sendKeys("admin", Keys.TAB, "password", Keys.ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.switchTo().activeElement().submit();

	}
}