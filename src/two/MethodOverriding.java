
package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class One{ 				//BaseClass ParentClass SuperCLass
	void Method1() {
		System.out.println("Method1 of class One");
	}
	
	void Method2() {
		System.out.println("Method2 of class One");
	}
	
}

class Two extends One{ 	//DerivedClass ChildClass SubClass
	
	@Override			//Annotation for overriding
	void Method2() { 	//Method Overriding		
		System.out.println("Method2 of class Two");
	}
	
	void Method3() {
		System.out.println("Method3 of class Two");
	}
	
}
class MethodOverriding { //MainCLass
	public static void main(String[] args) {
		Two t2 = new Two();
		t2.Method1();
		t2.Method2();		
		t2.Method3();
		
	}
}
