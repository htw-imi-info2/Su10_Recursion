package loop;

public class While {

	/**
	 * this is a simple example on how to construct a while loop with recursion.
	 * It takes an integer n and a character c and returns a String containing n
	 * c's.
	 * 
	 * @param n
	 *            - number of iterations
	 * @param c
	 *            - character that should be multiplied
	 * @return - String that contains c n times
	 */
	public static String simpleWhile(int n, char c) {
		if (n == 0)
			return "";
		return String.valueOf(c) + simpleWhile(n - 1, c);
	}

	/*
	 * Implementing a more generic while loop requires handing over a Condition
	 * to the loop function. Since Java 8, this can be done with lambdas; as we
	 * haven't already discussed them yet I'm using the old method of using a
	 * class or interface that contains one method representing the condition.
	 */

	public static String whileLoop(Condition condition, int n, char c) {
		if (!condition.isTrue(n))
			return "";
		else
			return String.valueOf(c) + whileLoop(condition, n - 1, c);
	}

}
