package palindrome;


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
