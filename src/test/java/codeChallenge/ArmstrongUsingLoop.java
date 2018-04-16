package codeChallenge;

public class ArmstrongUsingLoop {
	
	public static void main(String[] args) {
		for(long input =100;input < 1000;input++)
		{
			long n=input,sum=0;
		//	int numLen = String.valueOf(i).length();
			while(n>0)
			{
				long rev = n%10;
				n=n/10;
				sum=sum + (rev*rev*rev);
				//(int)(Math.pow(r, numLen))
			}
			if (input==sum)
			{
				System.out.println(input+" is Amstrong number");
			}
		}
	}
}



