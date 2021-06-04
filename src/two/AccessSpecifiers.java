package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
// There are 4 types of Access Specifiers
// - default == public
// - public
// - private
// - protected

class data{
	
	// Variable Access Specification
	String _default = "default"; 				// Can be called out of scope of a class
	public String _public = "public"; 			// Can be called out of scope of a class
	protected String _protected = "protected"; 	// Can only be accessed by other classes
	private String _private = "private"; 		// Cannot be Accessed by other classes
	// private protected String data1 = "";		// This was possible until JDK 1.0.2
	
	// Methods Access Specification
	// Can be called out of scope of a class
	void method() { 							
		System.out.println("Default Methods");		
	}
	// Can be called out of scope of a class
	public void mPublic() {						
		System.out.println("Public Methods");
	}
	// Can only be accessed by other classes
	protected void mProtected() {
		System.out.println("Protected Method");
		mPrivate();
	}
	// Cannot be Accessed by other classes
	private void mPrivate() {
		System.out.println("Private Method");
	}
	
}

class AccessSpecifiers {
	public static void main(String[] args) {
		
		data d1 = new data();
		System.out.println(d1._default);
		System.out.println(d1._public);
		System.out.println(d1._protected);
		//System.out.println(d1._private); 		// Error:This will be invisible to any class. 
		System.out.println("------------------");
		d1.method();
		d1.mPublic();
		d1.mProtected();
		//d1.mPrivate();						// Error:This will be invisible to any class.
	}
}