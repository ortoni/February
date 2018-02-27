package tricksJavaSel;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class CountofFiles {

	public static void main(String[] args) {
		File f = new File("E:\\Koushik\\Documents");
		int count = 0;
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

	}

}
