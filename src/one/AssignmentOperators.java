package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.Scanner;

class AssignmentOperators {
	public static void main(String[] args) {
		// Scanner java.util
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Enter Value 1: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Error:Only Numbers Allowed");
			System.out.println("Enter Value 1: ");
		}
		a = sc.nextInt();
		System.out.print("Enter Value 2: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Error:Only Numbers Allowed");
			System.out.println("Enter Value 1: ");
		}
		b = sc.nextInt();
		System.out.println("----------------------");
		System.out.println("Assignemt Opertor");
		System.out.println("----------------------");
		System.out.println("First Assignment: " + a);
		a += b;
		System.out.println("Addition: " + a);
		a *= b;
		System.out.println("Multiplication: " + a);
		a -= b;
		System.out.println("Subtraction: " + a);
		a /= b;
		System.out.println("Division: " + a);
	}
}
