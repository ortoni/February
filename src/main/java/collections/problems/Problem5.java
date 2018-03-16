package collections.problems;


public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String data = "INFY";
		
		char[] ch = data.toCharArray();
		for (char c : ch) {
			
			int val = (int) c;
			System.out.print((char) (val+1));
		}
		
		
		
	}


	
}











