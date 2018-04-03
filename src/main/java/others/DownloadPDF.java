package others;

import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DownloadPDF {
	RemoteWebDriver driver;
	ChromeOptions options;
	String downloadFilepath = "K:\\";
	HashMap<String, Object> prefs;
	Actions builder;
	@Test
	public void pdf() {
		options	 = new ChromeOptions();
		prefs = new HashMap<String, Object>();	// To put preferences using "prefs" (KeyWord)
		prefs.put("download.default_directory", downloadFilepath); //To set path
		prefs.put("safebrowsing.enabled", "false"); // To disable security check (keep or Cancel)
		prefs.put("plugins.always_open_pdf_externally", true);
		options.setExperimentalOption("prefs", prefs); // Adding preferences to ChromeOptions
		options.addArguments("--disable-extensions"); //to disable window browser
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://enos.itcollege.ee/~jpoial/allalaadimised/reading/");
		WebElement pdf = driver.findElementByLinkText("Advanced-java.pdf");
		pdf.click();
	}
	public void openInNewTab(WebElement ele) {
		builder = new Actions(driver);
		builder.sendKeys(ele,Keys.CONTROL).click().perform();
	}

}