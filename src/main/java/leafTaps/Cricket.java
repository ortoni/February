package leafTaps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.google.co.in");
		d.findElementById("lst-ib").sendKeys("cricket", Keys.ENTER);
		List<WebElement> cr = d.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
		System.out.println(cr.size());
	}
}
