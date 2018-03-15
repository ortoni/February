package tricksJavaSel;

import java.io.File;
import java.io.IOException;

public class SubFolderCounts {
	public static void main(String[] args) throws IOException {
		File dir = new File("K:\\Koushik\\Documents"); // current directory
		availabelFiles(dir);
	}

	public static void availabelFiles(File dir) throws IOException {
		File[] files = dir.listFiles();
		System.out.println("Total no.of Files "+files.length);
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getAbsolutePath());
				availabelFiles(file);
			} else {
				System.out.println("\t file:" + file.getName());
			}
		}
	}

}
