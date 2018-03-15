package others;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DownloadFiles {
static RemoteWebDriver driver;
	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		String downloadFilepath = "c:\\download";
		op.addArguments("--test-type");
		op.addArguments("--disable-extensions");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		 driver.get("http://www.seleniumhq.org/download/");
         driver.findElementByLinkText("32 bit Windows IE").click();
		
		 
	       /*HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 0);
	       chromePrefs.put("download.default_directory", downloadFilepath);
	       ChromeOptions options = new ChromeOptions();
	       HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
	       options.setExperimentalOption("prefs", chromePrefs);
	       options.addArguments("--test-type");
	       options.addArguments("--disable-extensions"); //to disable browser extension popup
	  
	       DesiredCapabilities cap = DesiredCapabilities.chrome();
	       cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
	       cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	       cap.setCapability(ChromeOptions.CAPABILITY, options);
	       driver = new ChromeDriver(cap);  
	                driver.get("http://www.seleniumhq.org/download/");
	                driver.findElement(By.linkText("32 bit Windows IE")).click();*/
	}
}