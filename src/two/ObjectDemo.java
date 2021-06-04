
package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class Employee {
	int id;
	String name;
	String city;

	
	public Employee() {
		System.out.println("Default Contructer");
	}
	//Method Overloading
	public Employee(int _id, String _name, String _city) {
		id = _id;
		name = _name;
		city = _city;
		//System.out.println(id + " : " + name + " : " + city);
	}
	
	//Method Overriding
	@Override
	public String toString() {
		return id + " : " + name + " : " + city;
	}
	
	//Method Overloading	
	public String toString(int _id) {
		id = _id;
		return id + " : " + name + " : " + city;
	}
	
	//Method Overriding
	@Override
	public int hashCode() {
		return 99;
	}
}

class ObjectDemo {
	public static void main(String[] args) {
		Employee emp0 = new Employee();
		Employee emp1 = new Employee(101, "Hardik", "Rajkot");
		Employee emp2 = new Employee(101, "Hardik", "Rajkot");
		Employee emp3 = new Employee(103, "Nishit", "Jamnagar");
		//This is where we use Unique Class.
		//- toString() is default
		//- equals() false
		//- getClass()
		//- hashCode()
		//- notify()
		//- notifyAll()
		//- wait()
		//- wait(milliseconds)
		//- wait(milliseconds,nanosecond)
		System.out.println("-------------------------------------------------");
		System.out.println("Object Methods Data Passed by Object Class by JVM");
		System.out.println(emp1); //MetaDeta given by JVM Unique Class(Object Class)		
		System.out.println(emp2.toString());
		System.out.println(emp2.toString(25));
		System.out.println(emp1.equals(emp2));
		System.out.println(emp3.getClass());
		System.out.println(emp3.hashCode());
	}
	
}
