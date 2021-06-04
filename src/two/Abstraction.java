package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
//There are 2 ways to achieve abstraction.
//1. Abstract 
//   - Abstract class should not have any object.
//	 - All Abstract methods should be override by extended class.
//2. Interfaces
abstract class fuel {
			
	abstract float petrol(float _price, float _tax);
	abstract float diesel(float _price, float _tax);
	abstract float cng(float _price, float _tax);
}

class state extends fuel {
	private float price;
	private float stateTax;
	private float netPrice;

	// we proved it
	@Override
	float petrol(float _price, float _tax) {
		price = _price;
		stateTax = _tax;
		return priceCalculation();
	}

	@Override
	float diesel(float _price, float _tax) {
		price = _price;
		stateTax = _tax;
		return priceCalculation();
	}

	@Override
	float cng(float _price, float _tax) {
		price = _price;
		stateTax = _tax;
		return priceCalculation();
	}

	final private float priceCalculation() {
		netPrice = price * stateTax / 100;
		return price += netPrice;
	}
}



public class Abstraction {
	public static void main(String[] args) {
		state gujarat = new state();
		System.out.println(gujarat.petrol(76, 15));
		System.out.println(gujarat.diesel(76, 15));
		System.out.println(gujarat.cng(40, 15));		
		System.out.println("--------------------------");

		state Maharastra = new state();
		System.out.println(Maharastra.petrol(80, 15));
		System.out.println(Maharastra.diesel(80, 15));
		System.out.println(Maharastra.cng(50, 15));
	}
}
