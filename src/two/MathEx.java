package two;


/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
import static java.lang.System.*; //Static Import
public class MathEx {
	public static void main(String[] args) {
		double x = 20.5;
		double y = 2;
		// To find max value
		out.println("Max " + Math.max(x, y));
		out.println("Min " + Math.min(x, y));

		// TO find floor value
		out.println("FLoor " + Math.floor(x));
		out.println("Ceil " + Math.ceil(x));

		// To find square root
		out.println("SQRT" + Math.sqrt(y));

		// To find power (20 power 20*20)
		out.println("Pow " + Math.pow(x, y));

		// To find logs
		out.println("Log " + Math.log(x));
		out.println("Log " + Math.log(y));

		// To find logs10
		out.println("Log10 " + Math.log10(x));
		out.println("Log10 " + Math.log10(y));

		// To find out power of 2
		out.println("Exp " + Math.exp(x));
		
		// To find out random value
		out.println("Random " + Math.random());
		
		// To find out Round value
	    out.println("Round " + Math.round(x));
				 

	}
}
