// if base class is derived only once than it is Single/Simple Inheritance

class Emp{
	double salary=30000.0;
}
class Dev extends Emp{
	int bonus = 2500;
}
public class SingleInheritance {
	public static void main(String[] args) {
		Dev d1 = new Dev();
		System.out.println("Developer salary is"+d1.salary);
		System.out.println("Developer Bonus is "+d1.bonus);
	}
}
