package bridge;

public class DemoSwitch {
	public static void main(String[] args) {
		String day = "Monday";	// Change day to any day example: String day = "Monday";
		switch (day) {
		case "Monday":
			System.out.println("Today is Monday");
			break;	// Remove break and observe
		case "Tuesday":
			System.out.println("Today is tuesday");			
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");			
			break;
		case "Thursday":
			System.out.println("Today is Thursday");			
			break;
		case "Friday":
			System.out.println("Today is Friday");			
			break;
		case "Saturday":
			System.out.println("Today is Saturday");			
			break;
		default:	// It is not mandatory (Optional)
			System.out.println("Today is Sunday");
			break;
		}
		
	}

}
