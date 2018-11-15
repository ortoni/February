package interviewPre;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int  ip = 2221222;
		int sum = 0;
		while(ip > 0) {
			int mod = ip %10;
			if(mod %2 != 0) {
				sum+=mod;
			}
			ip /= 10;
		}
		if(sum == 0) System.out.println("No odd numbers");
		else System.out.println(sum);

	}

}
