
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<>();
		nameList.addFirst("---------");
		nameList.add("Hardik");
		nameList.add("Ritesh");
		nameList.add("Antony");
		nameList.add("Akshay");
		nameList.remove(); // Starts removing from first element
		nameList.addLast("---------");
		nameList.remove(0);
		nameList.removeLast();
		System.out.println(nameList.contains("Ritesh"));		

		System.out.println(nameList.get(0));

		Iterator<String> itr = nameList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
