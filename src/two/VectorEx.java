package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.Vector;

// Simple Arrays are fixed length Arrays
// Vector is a Dynamic Arrays 

public class VectorEx {

	public static void main(String[] args) {

		Vector<String> vData = new Vector<String>();
		vData.add("Mango");
		vData.add("Grapes");
		vData.add("Papaya");
		vData.add("Coconut");
		vData.addElement("Gauva");
		vData.add("WaterMelon");
		vData.removeElement("Papaya");
		System.out.println(vData);
		vData.add("Orange");
		System.out.println(vData);
		// Default Capacity is 10 and than it increases by 10
		System.out.println(vData.capacity());
		// Size returns total elements of vector.
		System.out.println(vData.size());
		vData.remove(1);
		System.out.println(vData);
		
		

	}

}
