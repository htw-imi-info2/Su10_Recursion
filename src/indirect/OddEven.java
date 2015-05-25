package indirect;

public class OddEven {

	public static boolean isOdd(int i) {
		if (i == 0)
			return false;
		return isEven(i - 1);
	}

	public static boolean isEven(int i) {
		if (i == 0)
			return true;
		return isOdd(i - 1);
	}

}
