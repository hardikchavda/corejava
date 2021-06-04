public class TryCatchEx {
	public static void main(String[] args) {
		String s = null;
		int arr[] = new int[5];
		// Verification Zone
		try {
			arr[4] = 5/0;
			// int a = 100 / 5; // Arithmetic Exception
			// System.out.println(s.length()); // Null Exception
			// System.out.println(arr[5]); // Array Exception

			// Nesting of try catch
			try {
				//System.out.println(s.length()); // Null Exception
			} catch (Exception e) {
				System.out.println(e + " Inside Other Exceptions");
			}		
		} catch (ArithmeticException e) {
			//System.out.println(e + " Arithmatic");
			System.out.println(e.getCause());					
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e + " Null Value");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " Array Exceptions");
		} catch (Exception e) {
			System.out.println(e + " Any Other Exceptions");
			
		}
		finally {
			// Optional in try catch
			// To cleanup your work
			// To close connections of DB, File, etc.			
			System.out.println("Your connections are safe and closed.");
		}
		// Safe Zone
		System.out.println("Outside Handled error.");
	}
}
