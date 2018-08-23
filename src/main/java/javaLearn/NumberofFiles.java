package javaLearn;

import java.io.File;

public class NumberofFiles {

	public static void main(String[] args) {
		File file = new File("K:\\");
		boolean directory = file.isDirectory();
		System.out.println(directory);
		System.out.println(file.exists());
		String[] list = file.list();
		for (String string : list) {
			if (string.endsWith("txt")) {

				System.out.println(string);
			}
		}
	}

}
