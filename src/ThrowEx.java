
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.sql.Timestamp;
import java.util.Date;

public class ThrowEx {

	public static void main(String[] args) {

		checkAge(14);
		System.out.println("Thank You For Coming");

	}

	static void checkAge(int age) {

		Timestamp ts = new Timestamp(System.currentTimeMillis());

		if (age < 18) {
			// To create an runtime exception
			throw new ArithmeticException(new Date(ts.getTime()) + " You are not ready for vaccine.");

		} else {
			System.out.println("Your can take vaccine");
		}

	}

}
