package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
// Only Usage is allowed when using final keyword.
// 1. Stop Changing Value of Variables within a scope
// 2. Stop Method Overriding from Methods 
// 3. Stop Inheritance of Classes
// 4. Blank values are allowed but default constructor has to be used to instantiate blank values.
// 5. Arguments can be assigned as final
final class Student {
	final int rollno; // Blank Declaration.

	public Student() {
		rollno = 5;
		System.out.println(rollno + " Inside Default Contructor");
	}

	final void changeRollNumber() {
		// final float rollno = 2f; // change in value is possible if you change the
		// datatype
		// rollno = 9.5; // Cannot change value
		System.out.println(rollno);
	}

	void changeName(final String Name) {
		// Name = "Anonymous"; // Cannot change value
		System.out.println(rollno + ":" + Name);
	}
}

//class Attendance extends Student { 		// Cannot be extended
//	
////	void changeRollNumber() 			// Cannot be overridden
////	{
////		final float rollno = 3f; 		// Change in value is possible if you change the datatype
////		// rollno = 'g'; 				// Cannot change value
////		System.out.println(rollno);
////	}
//}

class FinalEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		// s1.rollno = 3; // Cannot change value
		s1.changeRollNumber();
		s1.changeName("Surya Singh");

//		Attendance bca_a = new Attendance();
//		bca_a.changeRollNumber();

	}
}
