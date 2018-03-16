package collections.problems;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Kid Request Portion
		char req = 'B';
		returnCandy(req);
	}


	public static void returnCandy(char c){
		// Seller Response Portion
		Map<Character, String> candies = new HashMap<Character, String>();
		candies.put('A', "IceCream Candy");

		if(c == 'A'){
			// do nothing
		}
		else if(c == 'B'){
			candies.put('B', candies.get('A'));
			candies.put('A', "");
		} else{
			candies.put(c, "Lollipop");
			candies.remove('A');
		}
		System.out.println(candies);
	}

}











