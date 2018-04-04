package basic;

import org.testng.annotations.Test;

public class TestDemo {
	@Test(dependsOnMethods= {"basic.DemoDemo.test"})
	public void test1() {	
		System.out.println("I am dependent on test methods");
		
	}

}
