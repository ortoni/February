package sms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			
	}

}
