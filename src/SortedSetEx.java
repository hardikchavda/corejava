
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		
		set.add("Audi");
		set.add("Mercedez");
		set.add("Lamborgini");
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		set.remove("Mercedez");
		System.out.println(set.size());		
		
		System.out.println(set);
		for (Object obj : set) {
			System.out.println(obj);
		}

	}
}
