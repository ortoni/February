package collections.problems.copy;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Your Spouse Request Portion
		char req = 'P';
		String[] storeItems = {"Salt","Pepper","Sugar","Tomato","Potato","Mango","Milk"};

		returnStore(storeItems, req);
	}


	public static void returnStore(String[] storeItems, char c){
		
		// Stored items in shop
		
		// Seller Response Portion
		Map<Character, String> storeBuy = new HashMap<Character, String>();
		String value="";
		for (String storeItem : storeItems) {
			if(storeItem.startsWith(""+c)){
				//System.out.println(storeItem);
				if(!value.equals(""))
					value = storeItem + "," + value;
				else
					value = storeItem;
			}
		}
		
		// add to the map
		storeBuy.put(c, value);
		System.out.println(storeBuy);
	}

}











