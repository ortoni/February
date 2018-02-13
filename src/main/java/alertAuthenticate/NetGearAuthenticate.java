package alertAuthenticate;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.openqa.selenium.chrome.ChromeDriver;

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
		/*driver.get("http://10.0.0.1/");
		Robot rb = new Robot();
		*/
		driver.findElementById("").isEnabled();
		
	}
}
		
