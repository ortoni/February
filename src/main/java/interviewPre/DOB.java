package interviewPre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DOB {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd mm yyyy");
		String dob = "27 09 1992";
		String currenDate = "17 09 2018";

		try {
		    Date date1 = simpleDateFormat.parse(dob);
		    Date date2 = simpleDateFormat.parse(currenDate);
		    long diff = date2.getTime() - date1.getTime();
		    long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		    System.out.println ("Days: " +days );
		    System.out.println("Age: "+(days / 365));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}

}
