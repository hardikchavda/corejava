
/**
 * @author Er. Hardik Chavda
 * https://t.me/hardikchavda
 * 
 */
class MethodOverloading {

	static void shoppingSite() {
		System.out.println("This is your Mobile Phone: Nokia 3315");
	}

	static void shoppingSite(String product) {
		System.out.println("This is your Mobile Device: " + product);
	}

	static void shoppingSite(String product, String images) {
		System.out.println("This is your Mobile Device: " + product + " and " + images);
	}

	static void shoppingSite(String product, String images, String warranty) {
		System.out.println("This is your Mobile Device: " + product + " and " + images + " and " + warranty);
	}

	public static void main(String[] args) {
		// Product without Name. GIFT
		shoppingSite();
		// Product with Name.
		shoppingSite("Apple Iphone 12 Pro");
		// Product with Name with Image.
		shoppingSite("OnePlus", "Images");
		// Product with Name with Image and including warranty.
		shoppingSite("OnePlus", "Images", "Warranty One Year");
	}
}
