import java.util.Scanner;

//Precedence and Associativity of Operators
class ArithmaticOperator {
	public static void main(String arg[]) {
		
		//Assignment Operator '='		
		int a = 5; 		
		float b = 12.0f;
		double c = 6.0;
		
		//double d = a+b+c; //17		
		double d = a*b/c; //10.0
		float x = 12.2f;
		float y = x/0.0f; //Addition '+' operator
		                  // Reassignment of a variable is not possible within same scope.
		//int y = x-6;    // Subtraction '-' operator
		//int y = x*6;    // Multiplication '*' operator
		//int y = x/6;    // Division '/' operator
					      // Division By Zero is not possible in Java.
					      // If not floating value than "/ by zero"
					      // else 'Infinity' will be displayed on screen.
		//int y = x%6;    //Modulo '%' operator
		System.out.print(y);			
	}
}
