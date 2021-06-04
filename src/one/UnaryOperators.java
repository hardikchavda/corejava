package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
/*
 * 
 * This program shows how Unary Operators are used in Java.
 * 
 * 
 * */

public class UnaryOperators {
	public static void main(String[] args) {
		int x = 10;
		/* 
		 * 1. x++ Postfix x=x+1
		   Increament Operators
		 
		 */
		System.out.println("Postfix Results");
		System.out.println("Increament");		
		System.out.println(x++); // 10
		System.out.println(x); // 11
		/*
		 * 
		 *  1. x-- Postfix x=x-1
		    Decreament Operators		
		 
		 */
		System.out.println("---------------------");
		System.out.println("Decreament");
		System.out.println(x--); // 11
		System.out.println(x); // 10
		
		System.out.println("------------------------------------");
		
		/*
		 *  2. ++x Prefix
		    Increament Operators
		 
		 */
		System.out.println("Prefix Results");
		System.out.println("Increament");
		// 1. ++x Prefix x=x+1
		System.out.println(++x); // 11
		System.out.println(x); // 11
		/*
		 * 
		 *  Decreament Operators
		    1. --x Prefix x=x-1
		 
		 */
		System.out.println("---------------------");
		System.out.println("Decreament");
		System.out.println(--x); // 10
		System.out.println(x); // 10
	}
}
