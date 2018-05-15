package interlace;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EBharatDate {
	RemoteWebDriver driver;

	@Test
	public void main() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///K:/Interlace/Date_eBharat/date/date.html");
		/*driver.findElementById("username").sendKeys("SCERTADMIN@5");
		driver.findElementById("password").sendKeys("p@ssw0rd", Keys.ENTER);*/
		
		// From Date
		WebElement fromDate = driver.findElementById("fromDate");
		// JavaScript to disable from date read only value
		try {
			driver.executeScript("document.getElementById('fromDate').removeAttribute('readonly');", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		fromDate.sendKeys("12/07/2011", Keys.ENTER);
		
		// To Date
		WebElement toDate = driver.findElementById("toDate");
		// JavaScript to disable To date read only value

		try {
			driver.executeScript("document.getElementById('toDate').removeAttribute('readonly');", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		toDate.sendKeys("15/05/2012", Keys.ENTER);
		driver.findElementById("title").sendKeys("Date Check");
	}
}
