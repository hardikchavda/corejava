package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
//Inheritance with Constructor
class BaseClass {
	BaseClass() {
		System.out.println("Base Constructor");
	}

	BaseClass(int x) {
		System.out.println("Base Class data of x:" + x);
	}
}

class DerivedClass extends BaseClass {
	// It gives priority to Base Class First
	// That means BaseClass will be executed first

	DerivedClass(int x) {		
		super(x);// To force to call an Base Class Constructor Super keyword is used. 
		System.out.println("Derived Constructor");
	}
}

class ConstructorInheritance {
	public static void main(String[] args) {
		DerivedClass d1 = new DerivedClass(30);		
	}
}
