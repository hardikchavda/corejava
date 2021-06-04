package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.Calendar;
import java.util.Date;

public class DateClassEx {

	public static void main(String[] args) {

		Date dt = new Date();

		System.out.println(dt);
		System.out.println(dt.getDate());
		dt.setDate(10);
		System.out.println(dt.getDate());
		System.out.println(dt.getDay()); // Sunday = 1
		System.out.println(dt.getMonth()); // 0-11
		System.out.println(dt.getHours()); // 0-23
		System.out.println(dt.getMinutes()); // 0-59
		System.out.println(dt.getSeconds()); // 0-59 61 if jvm leap
		System.out.println(dt.getTime()); // returns milliseconds since Jan 1 1970

		Date dt1 = new Date();
		dt1.setDate(20);
		System.out.println(dt.compareTo(dt1)); // 0 if date is equal
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, 10);		
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR, 2);
		System.out.println(cal.getTime());
		
		
		
		
		

	}

}
