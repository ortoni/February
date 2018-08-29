package interviewPre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DOB {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd mm yyyy");
		String dob = "04 12 1994";
		String currenDate = "29 08 2018";

		try {
		    Date date1 = simpleDateFormat.parse(dob);
		    Date date2 = simpleDateFormat.parse(currenDate);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}

}
