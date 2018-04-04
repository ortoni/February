package basic;

import org.testng.annotations.Test;

public class DemoDemo{
@Test()
	public void test() {	
		System.out.println("hi");
		throw new RuntimeException();
	}

}