package week3.day1;

import org.testng.annotations.Test;

public class TestDemo {
	@Test()
	public void a() {
		System.out.println("Method 1");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = 
		{"week3.day1.TestDemo.a", "week3.day1.TestDemo.c"})
	public void b() {
		System.out.println("Mmethod 2");
	}
	@Test()
	public void c() {
		System.out.println("Mmethod 3");
	}

}
