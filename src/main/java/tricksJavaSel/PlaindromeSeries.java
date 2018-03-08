package tricksJavaSel;

public class PlaindromeSeries {

	public static void main(String[] args) {
		String input = "malayalam";
		StringBuilder b = new StringBuilder(input);
		String rev =b.reverse().toString();
		//System.out.println(reverse);
		if(input.equals(rev)) {
			System.out.println("Its palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
