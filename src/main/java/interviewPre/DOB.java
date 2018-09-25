package interviewPre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DOB {

	public static void main(String[] args) {

		date("1994-12-04");
	}

	static void date(String date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		String dob = date;
		LocalDate now = LocalDate.now();
		String currenDate = now.toString();

		try {
			Date date1 = simpleDateFormat.parse(dob);
			Date date2 = simpleDateFormat.parse(currenDate);
			long diff = date2.getTime() - date1.getTime();
			long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			System.out.println("Days: " + days);
			System.out.println("Age: " + days / 365);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
