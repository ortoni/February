package december;

public class StringFormats {

	public static void main(String[] args) {
		Object floatVar = 12.12;
		Object intVar = 10;
		Object stringVar = "koushik";
		System.out.printf("The value of the float " + "variable is %.2f, while " +
				"the value of the " + "integer variable is %d, " + "and the string is %s",
				floatVar, intVar, stringVar);


		//System.out.println("");
		String fs = String.format("The value of the float " + "variable is %.2f, while " +
				"the value of the " + "integer variable is %d, " + "and the string is %s",
				floatVar, intVar, stringVar);
		System.out.println(fs);

	}

}
