package december;

import java.util.Scanner;

public class Match {

	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		System.out.println("Enter a String to find: ");
		String findit = sc.nextLine();
		int searchMeLength = search.length();
		int findMeLength = findit.length();
		int n = searchMeLength-findMeLength;
		boolean foundIt = false;
		for (int i = 0; i <= n ; i++) {
			if (search.regionMatches(i, findit, 0, findMeLength)) {
				foundIt = true;
				System.out.println("Matched");
			}
		}
		if (!foundIt){
			System.out.println("No match found.");
		}
		sc.close();
	}
}