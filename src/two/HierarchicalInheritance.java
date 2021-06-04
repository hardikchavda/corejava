package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
// if one class is extended multiple times than it is called as Hierarchical Inheritance

class water { // Base SuperClass
	public String minerel = "H2O";
	String type = "null";
}

class sea extends water { // Derived Classes
	String type = "salted";
	String name = "Oceon";

	void display() {
		System.out.println(name + ":" + type);
	}
}

class river extends water { // Derived Classes
	String type = "sweet";
	String name = "Ganga";
	String date = "1930";
	String pollutionLevel = "Ok";

	void display() {	
		System.out.println(name + ":" + type + ":" + pollutionLevel + ":" + date);
	}
}

class pond extends water { // Derived Classes
	String type = "sweet";
	String name = "Kakriya";

	void display() {
		System.out.println(name + ":" + type);
	}
}

class HierarchicalInheritance {
	public static void main(String[] args) {

		sea sIndia = new sea();
		sIndia.name = "Indian Ocean";
		sIndia.display();

		sea sAtlantic = new sea();
		sAtlantic.name = "Atlantic Ocean";
		sAtlantic.display();

		sea sPacific = new sea();
		sPacific.name = "Pacific Ocean";
		sPacific.display();

		river rYamuna = new river();
		rYamuna.name = "Yamuna";
		rYamuna.pollutionLevel = "Completely Ruined";
		rYamuna.date = "2021";
		rYamuna.type="Polluted Water";
		rYamuna.display();		
	}
}
