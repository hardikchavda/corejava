
class Recursion {
	/*
	 * factorial(0) = 1 
	 * factorial(n) = n*n-1 
	 * factorial(5) = 5*4*3*2 = 120
	 */
	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1); // Calling Method itself is Recursion.
		}
	}

	public static void main(String[] args) {

		int n = 1;
		if (n == 1 || n == 0) {
			System.out.println("Factorial is not possible");
		} else {
			System.out.println("The Value of factorial " + n + " is: " + factorial(n));
		}

	}
}
