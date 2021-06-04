package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
/*
 * Created by Er. Hardik Chavda
 * at Geetanjali College
 * For more info : https://t.me/hardikchavda
 * This program is used for Creating Result
 */
class SumOfValues {
	public static void main(String args[]){
		
		//Static Variable Declaration
		int java, csharp, net,os,sum;
		java = 50;
		csharp = 60;
		net = 50;
		os = 50;
		
		//Actual Calculation
		sum = java+csharp+net+os;
		
		//Printing Result
		System.out.println("Your Result is:");
		System.out.println("---------------");
		System.out.println("Java=       "+java);
		System.out.println("C#=         "+csharp);
		System.out.println("Networking= "+net);
		System.out.println("OS=         "+os);
		System.out.println("---------------");
		System.out.println("Total=      "+sum);
	
	}
}
