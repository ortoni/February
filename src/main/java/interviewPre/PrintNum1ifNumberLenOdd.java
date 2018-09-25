package interviewPre;

public class PrintNum1ifNumberLenOdd {
	// Print middle number if the length of the numbers id odd
	// else print two in between numbers
	// Example:
	// -- input int a = 12345 -- op = 3
	// -- 1234 = 23
	public static void main(String[] args) {
		int a = 1234;
		String string = Integer.toString(a);
		int length = string.length();
		System.out.println(length);
		if (length % 2 != 0) {
			char charAt = string.charAt(length / 2);
			System.out.println(charAt);
		} else {
			// System.out.println(string.charAt(length / 3) + string.charAt(length / 2));
		}
	}

}
