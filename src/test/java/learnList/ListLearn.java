package learnList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListLearn {
	public static void main(String[] args) {
	//	String[] Company = {"HCL", "Infosys", "TCS"};
/*
		Company[0] = "HCL";
		Company[2] = "INFOSYS";
		Company[1] = "TCS";*/
		List<String> ls = new ArrayList<String>();
		ls.add("TCS");
		ls.add("HCL");
		ls.add("INFOSYS");
		//ls = {"HCL", "Infosys", "TCS"};
		
		Collections.sort(ls);
		for (String a : ls) {
			System.out.println(a);
			
		}
		

	}
}
