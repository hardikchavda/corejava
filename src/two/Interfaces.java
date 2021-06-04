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
//	 - Interface supports multiple inheritance.
//	 - Another way of achieving abstraction.
//	 - Interface is an abstract class in background.
// 	 - To inherit an interface you have to use implements
//	 - Methods by default are abstract and public 
//	 - Interface does not support body.
// 	 - In Interface variables are always final static by default.
//	 - Interface cannot have constructors. 
//	 - Interface can be inherited by other interface with extend keyword.
interface petrol {
	float petrolConsumption();
}

interface diesel {
	float dieselConsumption();
}

interface cng {
	float cngConsumption();
}

class fuelConsumption implements petrol, diesel, cng {
	float state = 28;
	float city;
	float volume;

	@Override
	public float petrolConsumption() {
		volume = 20000;
		city = volume / state;
		return city;
	}

	@Override
	public float dieselConsumption() {
		volume = 10000;
		city = volume / state;
		return city;
	}

	@Override
	public float cngConsumption() {
		volume = 50000;
		city = volume / state;
		return city;
	}
}

class Interfaces {
	public static void main(String[] args) {
		fuelConsumption gujarat = new fuelConsumption();
		System.out.println(gujarat.petrolConsumption());
		System.out.println(gujarat.dieselConsumption());
		System.out.println(gujarat.cngConsumption());
	}
}