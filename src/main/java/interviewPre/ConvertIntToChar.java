package interviewPre;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class ConvertIntToChar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd mm yy");
		String now = LocalDateTime.now().toString();
		String currenDate = now.replaceAll("\\D", "");
		
		File f = new File("./reports1/"+currenDate);
		boolean mkdirs = f.mkdirs();
		System.out.println(mkdirs);

//				String txt = "1234";
//				System.out.println(txt);
//
//				int num = Integer.parseInt(txt);
//				System.out.println(num);
//
//				String text = String.valueOf(num);
//				System.out.println(text);

			}


	}


