package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.*;
public class RandomExample {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(20));
		System.out.println(rd.nextLong());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextDouble());
		
	}
}
