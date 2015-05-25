package reverse;

/**
 * the reverse printer constructs a new string with every recursive call (with
 * the string.substring(1) call) - resulting in an algorithm of O(n2) as the
 * String is copied each time. 
 * This one has an inner class "MyString"
 * that records the position in the string, eliminating the need to create
 * a new string on each recursive call - 
 * it does not work, however - can you fix it?
 * 
 * (change the Annotation of the "Ignored" test case in ReverseStringTest.java 
 * to see the failing test. The solution can be found in SmartReversePrinterFixed.java)
 * 
 * @author kleinen
 *
 */
public class SmartReversePrinter {

	class MyString {
		String string;
		int position;

		MyString(String string) {
			this.string = string;
			position = 0;
		}

		char head() {
			return string.charAt(position);
		}

		MyString tail() {

			position++;
			return this;
		}

		int length() {
			return string.length() - position;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		public char charAt(int i) {
			return string.charAt(i + position);
		}

	}

	public void print(String string) {
		print(new MyString(string));
	}

	public static void print(MyString string) {
		if (string.length() == 1)
			System.out.print(string.head());
		else {
			print(string.tail());
			System.out.print(string.charAt(0));
		}
	}
}
