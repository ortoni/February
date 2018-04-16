package december;

import java.util.Scanner;

public class StringGetChar {

	public static void main(String[] args) {
		System.out.println("Enter a String to check Palindrome ");
		Scanner scan = new Scanner(System.in);
		String palindrome =  scan.nextLine();		
		int len = palindrome.length();
		char[] temp = new char[len];
		char[] chararray = new char[len];
		
		// Instead of for loop we can use getChars()
		palindrome.getChars(0, len, temp, 0);

		/*for (int i = 0; i < len; i++) {
			temp[i] = palindrome.charAt(i);
		}*/

		for (int j = 0; j < len; j++) {
			chararray[j] = temp[len-1-j];		
		}

		String rev = new String(chararray);
		System.out.println("Reverse String is : "+rev);

		if(rev.equalsIgnoreCase(palindrome)){
			System.out.println("Palindrome");
		}else
			System.out.println("Not a palindrome");
		scan.close();

	}

}
