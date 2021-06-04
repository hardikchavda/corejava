package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
//Outer Class
class Geetanjali {
	String Stream = "Commerce";

	// Inner Class And Nested Classes
	class BCA {
		String Stream = "ComputerScience";

		void printData() {
			// Accessing outer class from inner class
			System.out.println(Stream);
		}
	}

	// You can declare inner classes as private, protected and public.
	private class BBA {
		String Stream = "Management";

		void printData() {
			// Accessing outer class from inner class
			System.out.println(Stream);
		}
	}

	// Inner class Inheritance
	class BCom extends BBA {

	}

	// Static Inner Class
	static class MSCIT {
		String Stream = "M.Sc.IT & CA";

		void printData() {
			// Accessing outer class from inner class
			System.out.println(Stream);
		}
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		Geetanjali stream = new Geetanjali();
		System.out.println("Default Stream: " + stream.Stream);
		// BCA
		Geetanjali.BCA bcaStud1 = stream.new BCA(); // Creating Inner class Instance from Outer class object
		bcaStud1.printData();
		// BBA Cannot be accessed as it is private.
		// Geetanjali.BBA bbaStud1 = stream.new BBA(); // Creating Inner class Instance
		// from Outer class object
		// bbaStud1.printData();
		// BCom
		Geetanjali.BCom bComStud1 = stream.new BCom();
		bComStud1.printData();

		// Static Reference of Inner Class
		Geetanjali.MSCIT mscStude1 = new Geetanjali.MSCIT();
		mscStude1.printData();
	}
}
