package week3.day4;

import org.testng.annotations.Test;

public class Man {
	@Test(dependsOnMethods = "walk")
	public void run() {
		System.out.println("Run");
	}
	@Test(dependsOnMethods ="sleep")
	public void walk() {
		System.out.println("walk");
	}
	@Test(dependsOnMethods ="run")
	public void sleep() {
		System.out.println("Sleep");
	}




}
