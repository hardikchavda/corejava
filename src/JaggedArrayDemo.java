/*
* Multidimensional Array
* Array of Arrays
* When Inner arrays are of different sizes than it is called as 
* Jagged Arrays.
* When column are of different sizes than it is called as 
* Jagged Arrays.
* 
*/
class JaggedArrayDemo {
	public static void main(String[] args) {

		int a[][] = new int[2][];
		
		// First Row has 3 Columns
		a[0] = new int[3];
		
		// First Row has 2 Columns
		a[1] = new int[2];

		// Initializing array with data
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = count++;
			}
		}
		// Displaying Jagged Array Elements
		System.out.println("Displaying 2D Jagged Array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------------------------------------");
		int b[][] = { 
				{ 5, 6, 7 },  // 3 Columns
				{ 8, 9 }, 	  // 2 Columns
				{10,11,12,13} // 4 Columns

		};
		
		System.out.println("Displaying 2D Jagged Array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
