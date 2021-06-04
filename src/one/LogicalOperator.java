package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class LogicalOperator {
	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("LogicalOperator");
		System.out.println("----------------------");
		// 'And' Operator
		System.out.println(a < b && b > a); // True
		System.out.println(a > b && b > a); // False
		System.out.println(a < b && b < a); // False
		System.out.println("----------------------");
		// 'Or' Operator
		System.out.println(a < b || b > a); // True
		System.out.println(a > b || b > a); // True
		System.out.println(a < b || b < a); // True
		System.out.println(a > b || b < a); // False
	}
}
