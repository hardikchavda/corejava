package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
// Wrapper class are used to convert primitive datatype into objects
// or object into primitive datatype.

// TO Create Collection
// TO Create Serializations
// TO Create Synchronizations

// Autoboxing Primitive -> Wrapper ClassObject 
// Unboxing   Wrapper ClassObject -> Primitive  
public class WrapperClass {
	public static void main(String[] args) {

		int a = 20; // Primitive DataType
		Integer a1 = Integer.valueOf(a); // Explicitly Converting int
		Integer aobj = a1; // Autoboxing Compiler will write Integer.valueOf(a) automatically
		System.out.println(a + ":" + a1 + ":" + aobj);

		Integer b1 = new Integer(15); // Wrapper Class Object
		int b = b1.intValue(); // Explicitly Converting Integer
		int c = b; // Unboxing Compiler will write b1.intValue() automatically
		System.out.println(b1 + ":" + b + ":" + c);

	}
}
