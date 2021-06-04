package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class Phone {
	void telephone() {
		System.out.println("Telephone");
	}
}

class SmartPhone extends Phone {
	//Only This Method will be called.
	@Override
	void telephone() {
		System.out.println("VOLTE");
	}
	void music() {
		System.out.println("Music");
	}

	void games() {
		System.out.println("Games");
	}
}

class DynamicMethodDispatching {
	public static void main(String[] args) {

		Phone nokia3315 = new Phone();
		System.out.println("------Phone--------");
		nokia3315.telephone();		
		
		SmartPhone SamsungM30 = new SmartPhone();
		System.out.println("------SmartPhone-------");
		SamsungM30.games();
		SamsungM30.music();
		SamsungM30.telephone();
		
		// This is Dynamic Method Dispatching
		// 1. You can call only Parent Class Members
		// 2. You can call only Child CLass Overridden Methods
		// SmartPhone abc = new Phone(); // Not Allowed
		Phone LTEDevice = new SmartPhone(); 
		LTEDevice.telephone();					
		
	}
}
