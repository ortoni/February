
package ArrayList;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		String[] Company = {"HCL", "Infosys", "TCS"};
		
		/*Company[0] = "HCL";
		Company[2] = "INFOSYS";
		Company[1] = "TCS";
		*/
		Arrays.sort(Company);
		for (String a : Company) {
			
			System.out.println(a);
		}
	}
}