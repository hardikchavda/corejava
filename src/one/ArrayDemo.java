package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
//Single Dimension Array
class ArrayDemo {
	public static void main(String[] args) {
			
		int a[];  //Declaration
		//Memory Allocation is done by "new" Special Operator
		a = new int[5];// Memory Allocation
		a[0] = 1; // Init
		a[1] = 2; // Init
		a[2] = 3; // Init
		a[3] = 4; // Init
		a[4] = 5; // Init
		System.out.println("Data from 1 - 5 First Array with Memory Allocation");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Data from 1 - 5 Second Array without Memory Allocation");
		
		int b[] = {1,2,3,4,5}; //Declaration & Initialization
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
