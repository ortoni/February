package leafTaps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://google.com");
		
			FirefoxDriver ff = new FirefoxDriver();
			ff.get("https://google.com");
		
			InternetExplorerDriver ie = new InternetExplorerDriver();
			ie.get("https://google.com");
	}

}
