package collections.problems.copy;

public class FindOccurencesInString {

	public static void main(String[] args) {

		String check = "Cognizant";
		/*int occuranceofN = 0;
		for (int i = 0; i < check.length(); i++) {
			char c = check.charAt(i);
			if (c == 'n') {
				occuranceofN++;
			}
		}
		System.out.println(occuranceofN);*/
	/*	int count = 0;
		char[] charArray = check.toCharArray();
		for (char c : charArray) {
			if(c=='n') {

				count++;
			}
		}
		System.out.println(count);
	}*/
	// Another way
		System.out.println(check.length() - check.replaceAll("n", "").length());
	}
}
