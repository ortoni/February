package bridge;

public class DemoIfElse {
	public static void main(String[] args) { // Program execution starts from here
		// Instead of Scanner, direct initializing is done
		String day = "monday";	// Change monday to another day and observe how its work
		if(day.equalsIgnoreCase("monday")) {
			System.out.println("Today is Monday");
		}else {	//equalsIgnoreCase means it will not consider case sensitive
			System.out.println("Today is not Monday");
		}
		
	}

}
