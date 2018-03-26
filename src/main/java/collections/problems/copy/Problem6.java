package collections.problems.copy;


public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String data = "true / false";
		/*char[] chrs = data.toCharArray();
		
		for (char c : chrs) {
			if((int)c == 32 || (int)c > 48){
				System.out.print(c);
			}
		}*/
		
		System.out.println(data.replaceAll("[^a-zA-Z0-9 ]", ""));
		
		
	}


	
}








/*System.out.println();

String data1 = "Gopi - Jayakumar";
System.out.println(data1.replaceAll("[^a-zA-Z0-9 ]", ""));*/


