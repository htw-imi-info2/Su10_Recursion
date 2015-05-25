package reverse;

/**
 * the reverse printer constructs a new string with every recursive call (with
 * the string.substring(1) call)
 * 
 * @author kleinen
 *
 */
public class SmartReversePrinterFixed {
	class MyString {
		String string;
		int position;

		MyString(String string) {
			this(string, 0);
		}

		MyString(String string, int position) {
			this.string = string;
			this.position = position;
		}

		char head() {
			return string.charAt(position);
		}

		MyString tail() {
			return new MyString(string, position + 1);
		}

		int length() {
			return string.length() - position;
		}

		@Override
		public String toString() {
			return string.substring(position).toString();
		}

		public char charAt(int i) {
			return string.charAt(i + position);
		}

	}

	public void print(String string) {
		if (string.length() < 1)
			return;
		print(new MyString(string));
	}

	private void print(MyString string) {
		if (string.length() == 1)
			System.out.print(string.head());
		else {
			print(string.tail());
			System.out.print(string.charAt(0));
		}
	}

	/**
	 * oh well. It works with the altered MyString class, but now we're creating
	 * a new MyString instance on every recursive call (although not a new
	 * String instance, so it might be a bit cheaper)
	 * 
	 * - how can we completely avoid this? it would be easy on a linked list, as
	 * this data structure makes it easy to split up the collection between the
	 * first element and the rest.
	 * 
	 * one way is to pass around the actual position within the string. This
	 * works and eliminates the need to construct new strings altogether;
	 */

	public void printLean(String string) {
		if (string.length() < 1)
			return;
		printLean_impl(string, 0);
	}

	/*
	 * this is also a common pattern of using a helper method with a different
	 * parameter list. As the recursive version needs an additional parameter to
	 * , this helper method is defined and the
	 */
	private void printLean_impl(String string, int i) {
		if ((string.length() - i) == 1)
			System.out.print(string.charAt(i));
		else {
			printLean_impl(string, i + 1);
			System.out.print(string.charAt(i));
		}
	}

}
