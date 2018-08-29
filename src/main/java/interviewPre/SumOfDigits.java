package interviewPre;

public class SumOfDigits {

	public static void main(String[] args) {

		int rem, sum =0;
		int number = 1234554321;
		while (number != 0) {
			rem = number %10;
			number = number /10;
			sum += rem;
		}
		System.out.println(sum);
	}	
}
