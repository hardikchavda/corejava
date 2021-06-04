
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
public class MethodArrayReferencing {
	static void simple(int a) {
		a = 98;
		System.out.println("Inside Simple: " + a);
	}

	static void data(int[] a) {
		a[0] = 98; // Data in Arrays will be changed in this method
		System.out.println("Inside Data: " + a[0]);
	}

	public static void main(String[] args) {
		// Case 1
		// Only Value is passed but reference is not passed.
		int a = 45;
		simple(a);
		System.out.println("Simple Data: " + a);

		// Case 2
		// In Java arrays are always referenced.
		int[] refData = { 50 };
		data(refData);
		System.out.println("Array Data: " + refData[0]);
	}
}
