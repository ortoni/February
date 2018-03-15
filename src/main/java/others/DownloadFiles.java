package others;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DownloadFiles {
	RemoteWebDriver driver;
	DesiredCapabilities cap;
	public void downloadFiles()	{
		String downloadFilepath = "K:\\";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();	
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);

		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions"); //to disable browser extension popup

		cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

	}
	@SuppressWarnings("deprecation")
	public void download() {
		driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("32 bit Windows IE")).click();
	}
}