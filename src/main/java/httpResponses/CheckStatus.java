package httpResponses;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import projectDayTestCases.Flipkart;

public class CheckStatus {
	RemoteWebDriver driver;
	@ Test

	public void main() throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(new HttpGet("http://www.flipkart.com/"));
		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode == HttpStatus.SC_OK) {
			System.out.println(statusCode);
			new Flipkart().flip();
		}
		
	}

}
