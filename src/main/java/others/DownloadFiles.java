package others;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
@Test
public class DownloadFiles {
	RemoteWebDriver driver;
	DesiredCapabilities cap;
	@SuppressWarnings("deprecation")
	public void downloadFiles()	{
		ChromeOptions options = new ChromeOptions();

		String downloadFilepath = "K:\\";
		HashMap<String, Object> setPath = new HashMap<String, Object>();	
		setPath.put("download.default_directory", downloadFilepath);

		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", setPath);
		options.addArguments("--disable-extensions"); //to disable browser extension popup

		cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("32 bit Windows IE")).click();
	}
}