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
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		long fib0 = 0;
		long fib1 = 1;
		long fib2 = 3;
		for (int i = 2; i <= n; i++) {
			fib2 = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib2;
		}
		return fib2;

	}

}
