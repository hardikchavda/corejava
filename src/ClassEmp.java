// Why create classes ?
// Any Real World Object will have to details 
// [Property]   [Behavior]
// OOP converts this idea in below form.... 
// [Attributes(Property)] [Methods(Behavior)]
class Employee {
	String name;    // -> Attributes
	int id;         // -> Attributes
	double salary;  // -> Attributes	

	//Method or Behavior
	void printDetails() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Salary is " + salary);
		System.out.println("------------------------");
	}
}

class ClassEmp {
	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp1 = new Employee();

		//Settings Attribute for Employee 1
		emp.id = 1;
		emp.name = "Hardik Chavda";
		emp.salary = 25000.0;
		emp.printDetails();

		//Settings Attribute for Employee 2
		emp1.id = 2;
		emp1.name = "Mital Shah";
		emp1.salary = 20000.0;
		emp1.printDetails();

	}
}
