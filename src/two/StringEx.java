package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
// String is a sequence of char. 
// String are immutable
// Strings implements Serializable, Comparable, charSequances etc.
public class StringEx {

	public static void main(String[] args) {

		char[] ch = { 'J', 'A', 'V', 'A' };
		String ch1 = new String(ch); // Explicit Conversion
		System.out.println(ch1);

		// We can create String object by two ways.
		String a = "Geetanjali"; // Literal will be in a pool
		String a1 = new String(" Geetanjali  "); // new creates another reference

		// Returns chatAtgiven position from String
		System.out.println(a.charAt(9));

		// Compares two string object
		// Returns 0 in int if both values are equal
		System.out.println(a.compareTo(a1));

		// Concats two strings
		System.out.println(a.concat(ch1));

		// Contains returns bool value
		System.out.println(a.contains("G"));

		// equals returns bool value
		System.out.println(a.equals("Hello"));

		// Length returns string count in int
		System.out.println(a.length());

		// Replace replace characters inside string
		System.out.println(a.replace('i','Y'));
		
		//Trim
		System.out.println(a.trim());
		
		//UpperCase
		System.out.println(a.toUpperCase());
		
		//LowerCase
		System.out.println(a.toLowerCase());
		
		//To convert other data to String.
		System.out.println(String.valueOf(500));
		
		String data="";
		//isEmpty returns true if empty
		System.out.println(data.isEmpty());
		

	}

}
