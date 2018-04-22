package merlin;

import java.io.File;

public class Check {
	public static void main(String[] args) {
		File dir = new File("C:/TestLeaf/Tuna408185637");
		if (!dir.exists()) 
			dir.mkdirs();
		File[] files = dir.listFiles();
		System.out.println("Total no.of Files "+files.length+" in the directory: "+dir.getAbsolutePath());
	}

}
