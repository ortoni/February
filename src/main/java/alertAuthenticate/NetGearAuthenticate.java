package alertAuthenticate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class NetGearAuthenticate {
	public static void main(String[] args) throws IOException {
		InternetExplorerDriver driver = new  InternetExplorerDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://merlin.rheincs.net");
		Runtime.getRuntime().exec("./resources/Auth.exe");

	}
}