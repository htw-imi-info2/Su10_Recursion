package reverse;

public class ReversePrinter {

	public static void print(String string) {
		if (string.length() <= 1)
			System.out.print(string);
		else {
			print(string.substring(1));
			System.out.print(string.charAt(0));
		}
	}
	/*
	 * for the bored: what is the complexity of this 
	 * method (in terms of the string length)?
	 * See at the two other versions for attempts to 
	 * improve that.
	 */

}
