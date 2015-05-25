package stacksize;

public class Recursion {
	public static void main(String[] args) {
		new Recursion().recursion(0);
	}

	private void recursion(int i) {
		System.out.println("call #" + i);
		recursion(i + 1);
	}
}
