package tricksJavaSel;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class KnowYourSystem {

	public static void main(String[] args) throws UnknownHostException {
	
		InetAddress ip = InetAddress.getLocalHost();
		String hostName = ip.getHostName();
		String hostAddress = ip.getHostAddress();
		System.out.println(hostName);
		System.out.println(hostAddress);
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
	}

}
