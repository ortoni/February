package week3.day4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeMethods implements WdMethods{
	public RemoteWebDriver driver=null;

	@Override
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("Brower "+browser+" launched successfuly");
		} catch (WebDriverException e) {
			System.err.println("UnKnow Exception as occurred");
		}	
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id": return driver.findElementById(locValue);
			case "xpath": return  driver.findElementByXPath(locValue);
			case "class": return driver.findElementByClassName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element not found");
		}catch (WebDriverException e) {
			System.err.println("UnKnow Exception as occurred");
		}	
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println(data +" entered successfully");
		} catch (ElementNotVisibleException e) {
			System.err.println("The Element not visiable");
		} catch (WebDriverException e) {
			System.err.println("unknow Exception as Occurred");
		}
	}

	@Override
	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("Element clicked successfully");
		}catch (WebDriverException e) {
			System.err.println("unknow Exception as Occurred");
		}
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if (text.equals(expectedText)) {
			System.out.println("The Text "+text+" matched with "+expectedText);
		} else {
			System.out.println("The Text "+text+" not matched with "+expectedText);
		}

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			System.err.println("IOException as Occurred");
		}
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}