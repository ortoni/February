package collections.problems.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Customer Request Portion
		Map<String, String> customerReq = new HashMap<String, String>();
		customerReq.put("Vanila", "Chocolate chips");
		returnIceCreams(customerReq);




	}


	public static Map<String, String> returnIceCreams(Map<String,String> ic){
		// Seller Response Portion
		ic.put("CheeseCake", "Sliced almonds");
		if(ic.containsKey("Black Raspberry")){
			ic.put("Black Raspberry", "Chocolate chips");
		}else if(ic.containsKey("Vanila")){
			ic.put("Vanila", "Maraschino cherry");
		}else if(ic.containsKey("Caramel Apple Crunch")){
			ic.put("Caramel Apple Crunch", "Strawberries");
		}
		System.out.println(ic);
		return ic;
	}

}











