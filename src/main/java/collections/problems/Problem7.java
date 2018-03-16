package collections.problems;


public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String data = "Babu".toLowerCase();
		char[] allChrs = data.toCharArray();
		int vowels = 0;

		for (char c : allChrs) {

			if(c == 'a' ||c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			}
		}
		System.out.println(vowels);

				

		String data1 = data.replaceAll( "[^aeiou]+", "" ); 

		int numVowels     = data1.length(); 
		System.out.println(numVowels);

		
	}



}








/*System.out.println();

String data1 = "Gopi - Jayakumar";
System.out.println(data1.replaceAll("[^a-zA-Z0-9 ]", ""));*/


