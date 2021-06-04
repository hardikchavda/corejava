package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		// Put
		map.put(1, "Mango"); // Putting Values
		map.put(2, "Orange");
		map.put(4, "Coconut");

		map.put(1, "Grapes"); // Stops Duplication

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue());
		}

		// PutIfAbsent
		map.putIfAbsent(3, "Papaya");
		System.out.println("---------------------");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue());
		}
		System.out.println(map.size());

		// Remove
		map.remove(1, "Grapes");// Removes only if value and key are same in list.
		System.out.println("---------------------");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue());
		}
		System.out.println(map.size());
		// Contains
		if (map.containsKey(1)) {
			// Replace
			map.replace(1, "GRAPES");
			System.out.println("---------------------");
			for (Map.Entry m : map.entrySet()) {
				System.out.println(m.getValue());
			}
			System.out.println(map.size());
		} else {
			System.out.println("No Such key to replace");
		}
	}

}
