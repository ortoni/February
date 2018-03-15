package tricksJavaSel;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountofFiles {

	public static void main(String[] args) {
		//using jav
		File dir = new File("K:\\Koushik");
		String[] list = dir.list();
		System.out.println("Total length including sub folder "+list.length);
		for (String file : list) {
			System.out.println(file.toString());

		}
		System.out.println("******************************");
		for (String fileExtension : list) {
			if (fileExtension.endsWith("docx") || fileExtension.endsWith("xlsx") ==true) {
				System.out.println(fileExtension);
			}
		}

		// aUsing apache POI
		//list.
		/*	int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				String name = file.getName();
				String extension = FilenameUtils.getExtension(name);
				if(extension.equals("xlxs") || extension.equals("docx"))
				{
					System.out.println(name);
				}
				count++;
			}
		}
		System.out.println("total number of files: " + count);
		 */
	}

}
