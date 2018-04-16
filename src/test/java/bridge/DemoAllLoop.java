package bridge;

public class DemoAllLoop {
	public static void main(String[] args) {
		System.out.println("I am for Loop");
		for (int i = 0; i < 5; i++) { // It will iterate 5 times 
			System.out.println(i);			
		}
		System.out.println("I am While Loop");
		int i = 0;
		while(i <=5) {//	It will iterate 6 times (<=5)
			System.out.println(i);	
			i++;
		}
		System.out.println("I am do While Loop");
		int j = 10;
		do {
			System.out.println(j);	// one execution will take place even the condition is not satisfied
			j++;
		} while (j<5);	//Here the condition is failed, But it will execute once, coz its do while
		// Change j<5 to j < 15 and observe
		
	}

}
