package palindrome;

import stack.LinkedListStack;
import stack.Stack;
import stack.Underflow;

public class Palindrome {
	// 2. Determine if a string is a palindrome (reading the same from the
	// beginning as the end)

	public boolean recursiveCheck(String string) {
		int l = string.length();
		if (l < 2)
			return true;
		if (string.charAt(0) != string.charAt(l - 1))
			return false;
		return recursiveCheck(string.substring(1, l - 1));
	}
	// b. using a stack
	public boolean checkWithStack(String string) {
		try {

			Stack<Character> stack = new LinkedListStack<>();
			int length = string.length();
			int middle = length / 2;
			for (int i = 0; i < middle; i++) {
				stack.push(string.charAt(i));
			}
			if ((length % 2) == 1) {
				middle++;
			}
			for (int i = middle; i < length; i++) {
				if (string.charAt(i) != stack.top())
					return false;
				stack.pop();
			}
			return stack.isEmpty();
		} catch (Underflow e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	// c. using a loop

	public boolean checkWithLoop(String string) {
		int length = string.length();
		int last = length - 1;
		int middle = length / 2;
		for (int i = 0; i < middle; i++) {
			if (string.charAt(i) != string.charAt(last - i))
				return false;
		}
		return true;
	}
}
