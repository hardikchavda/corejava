package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
// This class is used to crate mutable(change) string.
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hardik");
		sb.append("Chavda");
		System.out.println(sb);
		sb.insert(6, "Manoj");
		System.out.println(sb);
		sb.replace(6, 11, " M ");
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		// Normal buffer has size of (16*2)+2=34
		System.out.println(sb.capacity());
		

	}

}
