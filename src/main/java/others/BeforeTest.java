package others;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeTest {
	@BeforeMethod
	public void before() {
		System.out.println("before");
	}
	@AfterMethod
	public void after() {
		System.out.println("After");
	}

}
