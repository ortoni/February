package intermediate;

public class LearnString {
	public static void main(String args[])
	{
		//data variable in array
		String[] word = {"funk", "chunk", "furry", "koushik"};
		
		//Starts with letters fu
		for (String w : word) {
			if(w.startsWith("fu"))
				System.out.println(w +" Start with fu");}
		System.out.println("\n");
		
		//ends with k
		for (String w : word) {
			if(w.endsWith("k"))
			System.out.println(w+ " Ends with k");
		}
		System.out.println("\n");
		
		//partial search by k
		for (String w : word) {
			if(w.contains("k"))
			System.out.println(w+ " contain with k");
		}
			
		}
	}
 