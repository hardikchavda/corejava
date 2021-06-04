import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		Stack<String> data = new Stack<>();
		System.out.println(data.isEmpty());		
		data.add("Laptop");
		data.add("Desktop");
		data.add("Surface");
		data.add("Printer");		
		data.push("Keyboard");
		data.push("Joystick");
		data.add("Mouse");
		data.remove(0);
		data.remove("Keyboard");		
		
		System.out.println(data.firstElement());
		System.out.println(data.lastElement());
		System.out.println(data.isEmpty());
		System.out.println(data);
		data.pop();
		System.out.println(data);		
		System.out.println(data.peek());
		
		
		

	}

}
