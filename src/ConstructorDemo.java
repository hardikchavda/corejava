
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class MyClass {
	// Your New Account
	MyClass(double _baL, String _passbooK, String _namE, String _kyC) {
		double minBalance = _baL;
		String passbook = _passbooK;
		String name = _namE;
		String kyc = _kyC;
		System.out.println("Parameterized Constructor");
		System.out.println(minBalance + " " + passbook + " " + name + " " + kyc);
	}

	// Your New Account Without Verification
	MyClass(double _baL, String _passbooK, String _namE) {
		double minBalance = _baL;
		String passbook = _passbooK;
		String name = _namE;
		String kyc = "Incomplete Verification";
		System.out.println("Constructor Overloaded");
		System.out.println(minBalance + " " + passbook + " " + name + " " + kyc);
	}

	// Default Details
	MyClass() {
		System.out.println("For New Account Requirement");
		System.out.println(" ID Proof\n Address Proof \n Passport Size Photograph \n Aadhar Card \n PanCard");
	}

}

public class ConstructorDemo {
	public static void main(String[] args) {
		// Simple Constructor
		MyClass mc3 = new MyClass();
		// Parameterized Constructor
		MyClass mc = new MyClass(1000.0, "Yes", "Hardik Chavda", "Ok");
		// Constructor Overloading
		MyClass mc2 = new MyClass(10000.0, "No", "Ashok Gadhvi");

	}
}
