import java.util.ArrayList;

public class ThrowsEx {

	public static void main(String[] args) {

		ArrayList<String> data = new ArrayList<>();
		data.add("Hello");
		data.add(null);
		data.add("Mango");
		data.add("Potato");

		try {
			System.out.println(checkStringLength(data.get(1)));
		} catch (Exception e) {
			System.out.println(e);
			// e.printStackTrace();
		}

	}

	// throws is used to suppress the error for this method
	static int checkStringLength(String data) throws ArithmeticException {
		try {
			int check = data.length();
			return check;
		} catch (Exception e) {
			// This exception should be handled by the user of this method
			throw new ArithmeticException("Null Values are not allowed");
		}
	}

}
