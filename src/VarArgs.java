
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class VarArgs {

	static int sum(int... arr) { // VarArgs
		int result = 0;

		// for (int i = 0; i < arr.length; i++) {
		// result += arr[i];
		// }

		// Only for arrays
		// Starting of array will be from 0 
		// Size of Array will be calculated by itself 
		// Increament is not required  
		for (int a : arr)
		{
			result += a;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("The Sum of value 5 and 4 is: " + sum(5, 4));
		System.out.println("The Sum of value 5, 4 and 7 is: " + sum(5, 4, 7));
		System.out.println("The Sum of value 5, 4, 7 and 9 is: " + sum(5, 4, 7, 9));

	}
}
