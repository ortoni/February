package javaChallenge;

public class PlaindromeSeries {

	public static void main(String[] args) {
		String input = "malayalam";
		StringBuilder b = new StringBuilder(input);
		b.reverse();
		String rev = b.toString();
		//System.out.println(reverse);
		if(input.equals(rev)) {
			System.out.println("Its palindrome");
		}else {
			System.out.println("Not palindrome");
		}



	}

}
