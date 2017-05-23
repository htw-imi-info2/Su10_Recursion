package fib;
/**
 * Two Variants to compute fibonacci numbers
 * fib(0) = 0
 * fib(1) = 1
 * fib(n) = fib(n-2) + fib(n-1) for n > 2
 * @author kleinen
 *
 */
public class Fib {

	public static long fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static long fibLoop(int n) {
		long fib_n_2 = 1; // fib(n-2) 
		long fib_n_1 = 0; // fib(n-1)
		long fib_n = 0;   // fib(n) 
		for (int i = 1; i <= n; i++) {
			fib_n = fib_n_2 + fib_n_1;
			fib_n_2 = fib_n_1;
			fib_n_1 = fib_n;
		}
		return fib_n;

	}

}
