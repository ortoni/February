package tricksJavaSel;

import java.io.IOException;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Process pro = Runtime.getRuntime().exec(filePath);
	}

}
