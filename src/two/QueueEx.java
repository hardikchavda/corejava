package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Object> ticket = new LinkedList<Object>();
		ticket.add("a1");
		ticket.add("a2");
		ticket.add("a3");
		ticket.add(1);
		ticket.add('a');

		System.out.println(ticket);
		System.out.println(ticket.element());
		System.out.println(ticket.peek());
		ticket.poll();
		System.out.println(ticket);
		ticket.remove("a5");
		System.out.println(ticket);
		ticket.offer("123");	
		System.out.println(ticket.size());
		System.out.println(ticket);

	}
}
