/*
 * 
 * Rectangular Array
 * Multi Dimensional Array
 * Array of Arrays
 * 
 * 
 * */
class RectArrayDemo {
	public static void main(String[] args) {
		// int a[row][column];
		int a[][] = new int[5][5]; // Declaration & Memory Allocation		
		//[0]
		//[0-1]->id:0213
		//[0-2]->name:hardik
		//[0-3]->address:rajkot
		
		//[1]
		//[1-1]->id:0245
		//[1-2]->name:data2
		//[1-3]->address:city2
		
		//First Row Elements
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;
		a[0][4] = 5;
		//Second Row Elements
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;
		a[1][3] = 9;
		a[1][4] = 10;
		//Third Row Elements
		a[2][0] = 11;
		a[2][1] = 12;
		a[2][2] = 13;
		a[2][3] = 14;
		a[2][4] = 15;
		//Fourth Row Elements
		a[3][0] = 16;
		a[3][1] = 17;
		a[3][2] = 18;
		a[3][3] = 19;
		a[3][4] = 20;
		//Fifth Row Elements
		a[4][0] = 21;
		a[4][1] = 22;
		a[4][2] = 23;
		a[4][3] = 24;
		a[4][4] = 25;

		for (int i = 0; i < a.length; i++) { // row count
			for (int j = 0; j < a[i].length; j++) { // column count				
				System.out.print(a[i][j] + " ");
			}			
			System.out.println("");
		}		
		System.out.println("--------------------------------------------------");
		
		
		int b[][] = {
			//  C1 C2 C3
				{1, 2, 3}, //First Row  0 User1
				{4, 5, 6}  //Second Row 1 User2
		};
		System.out.println("  0 1 2");
		System.out.println("-------");
		for (int i = 0; i < b.length; i++) { // row count
			System.out.print(i+"|");
			for (int j = 0; j < b[i].length; j++) { // column count
				System.out.print(b[i][j]+" ");
			}	
			System.out.println("");
		}
		
		String c[] = {"Rajkot","Ahmedabad","Surat"};
		//               c[0]      c[1]       c[2]
	}
}
