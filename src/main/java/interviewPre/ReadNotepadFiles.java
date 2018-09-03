package interviewPre;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadNotepadFiles {
	String fileLocation = "C:\\Users\\dell\\Desktop\\jscript.txt";	
	@SuppressWarnings("deprecation")
	public List<String> notepad() {
		List<String> finalText = new ArrayList<String>();
		try {
			List<String> readLines = FileUtils.readLines(new File(fileLocation));
			for (String text : readLines) {
				finalText.add(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return finalText;
	}

}
