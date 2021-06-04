package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalenderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar gcal = new GregorianCalendar();
		System.out.println(gcal.isLeapYear(2048));
		System.out.println(
				gcal.get(Calendar.DATE) + ":" + (gcal.get(Calendar.MONTH) + 1) + ":" + gcal.get(Calendar.YEAR));
		System.out.println(gcal.get(Calendar.HOUR) + ":" + gcal.get(Calendar.MINUTE) + ":" + gcal.get(Calendar.SECOND));
		System.out.println(gcal.getTimeInMillis());
		System.out.println(gcal.getCalendarType());
		System.out.println(gcal.getWeekYear());

	}

}
