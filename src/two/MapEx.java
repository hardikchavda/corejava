package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.*;

public class MapEx {

	public static void main(String[] args) {

		Map<Integer, String> rollno = new HashMap<Integer, String>();

		rollno.put(1, "One");
		rollno.put(2, "Two");
		rollno.put(3, "Three");
		rollno.put(4, "Four");

		System.out.println(rollno);

		System.out.println(rollno.size());

		Set<?> set = rollno.entrySet();
		Iterator<?> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<?, ?> entry = (Map.Entry<?, ?>) itr.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());

		}

	}

}
