package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("My Name is Er. Hardik Chavda");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {					
			System.out.println(st.nextToken());
		}
		

		System.out.println("---------------");
		
		StringTokenizer st2 = new StringTokenizer("My Name is Er. Hardik Chavda", ". ");
		System.out.println(st2.countTokens());
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		System.out.println("---------------");
		
		StringTokenizer st3 = new StringTokenizer("My Name is Er. Hardik Chavda", ". ", true);
		System.out.println(st3.countTokens());
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}

}
