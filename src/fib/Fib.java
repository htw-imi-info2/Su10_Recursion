package fib;

public class Fib {

	public static long fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static long fibLoop(int n) {
		long fib0 = 1;
		long fib1 = 0;
		long fib2 = 0;
		for (int i = 1; i <= n; i++) {
			fib2 = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib2;
		}
		return fib2;

	}

}
