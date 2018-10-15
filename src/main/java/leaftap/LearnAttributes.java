package leaftap;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(dependsOnMethods = "leaftap.LearnAnnotations.walk", 
			alwaysRun = true)
	public void run() {
		System.out.println("I am running");
	}

	@Test(expectedExceptions = RuntimeException.class)
	public void walk() {
		System.out.println("I am walking");
		throw new RuntimeException();
	}

	/*
	 * @Test( priority = -1 ) public void sleep() {
	 * System.out.println("I am sleeping"); }
	 */
}
