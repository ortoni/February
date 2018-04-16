package alertAuthenticate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class NetGearAuthenticate {
	public static void main(String[] args) throws IOException {
		//InternetExplorerDriver driver = new  InternetExplorerDriver();
		FirefoxDriver driver = new FirefoxDriver();
		FirefoxFilter filter = new FirefoxFilter();
		filter.apply(null);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://Madmin:Micr0.com@merlin.rheincs.net");




	}
}