package alertAuthenticate;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class NetGearAuthenticate {
	public static void main(String[] args) {
		
		InternetExplorerOptions op = new InternetExplorerOptions();
		op.setCapability("", "");
		op.requireWindowFocus();
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://madmin:Micr0.com@merlin.rheincs.net");		
		//driver.get("http://admin:password@192.168.1.1");
	}
}