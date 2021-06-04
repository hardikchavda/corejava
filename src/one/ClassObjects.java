package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class ClassObjects {
	public static void main(String[] args) { // Main Methods

		/*
		 *  Create a static reference of a method
		 *  ClassTest = 0x11100  //Memory Hoge
		 * 
		 * 	Creating an objcect of classtest
		 * 	ct1 = 0x12000
		 *  ct2 = 0x13000
		*/
		// Declaration
		int a, a1;
		int b, b1;
		double c = 0, c1 = 0;

		// Initialization
		a = 15;
		b = 20;
		a1 = 50;
		b1 = 70;
		
		ClassObjects ct1 = new ClassObjects();

		// Conditional Calculation
		c = ct1.condcalc(a, b);    
		c1 = ct1.condcalc(a1, b1); 

		// Output
		ct1.displayData(c);
		ct1.displayData(c1);
	}

	// Common Method for Conditional Calculation
	int condcalc(int x, int y) {
		int z;
		if (x < y) {
			z = x + y;
		} else {
			z = x + y * x;
		}
		return z;
	}

	//Common Method for Displaying Conditional Calculation
	void displayData(double d) {				
		System.out.println("Conditional Data: "+d);
		System.out.println("--------------");
	}

}