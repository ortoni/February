package alertAuthenticate;

import java.awt.AWTException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NetGearAuthenticate {
	public static void getIP() throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		String hostName = ip.getHostName();
		String hostAddress = ip.getHostAddress();
		System.out.println(hostName);
		System.out.println(hostAddress);

	}

	public static void main(String[] args) throws InterruptedException, AWTException, UnknownHostException {
		getIP();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.1");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//Thread.sleep(5000);
		   driver.switchTo().frame(1);
		   Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		   
		driver.switchTo().alert().sendKeys("admin");
		
	}
}
		
