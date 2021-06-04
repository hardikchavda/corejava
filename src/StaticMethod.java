
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
public class StaticMethod {

	static int a, b, a2, b2; // Class Variables/Class Member

	static int sum(int a, int b) { // Class Member or Class Methods, Static Method
		int sum = a + b;
		return sum;
	}

	static void display() {
		a = 20;
		b = 50;
		a2 = 50;
		b2 = 60;
		// 1. You can call methods directly.
		// 2. You can call methods with the name Class
		// 3. It is not compulsory to create an object of class.
		System.out.println(StaticMethod.sum(a, b)); // 0x20
		System.out.println(sum(a2, b2)); // 0x20
		System.out.println(sum(a, b)); // 0x20
	}

	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.display();
	}

}
