package one;
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
//Test the sizes of Primitive Datatypes with their classes.
//Deviding your datatype with 8 bits = 1 byte .
class Datatypes {	
	public static void main(String args[]) {
		System.out.println("Size of Integer: "+ (Integer.SIZE/8) + " bytes.");
		System.out.println("Size of Long: "+ (Long.SIZE/8) + " bytes.");
		System.out.println("Size of Character: "+ (Character.SIZE/8) + " bytes.");
		System.out.println("Size of Float: "+ (Float.SIZE/8) + " bytes.");
		System.out.println("Size of Double: "+ (Double.SIZE/8) + " bytes.");
	}
}