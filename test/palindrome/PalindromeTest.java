package palindrome;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindromeTest {

	@Parameters
	public static Collection<Object[]> generalTestCases() {
		return Arrays.asList(new Object[][] { { true, "X" }, { true, "OO" }, { true, "uhu" }, { true, "ABBA" },
				{ true, "asdf poiu uiop fdsa" }, { false, "ABAB" }, { false, "AB" },
				{ false, "ojasdf ojasdfojsd ojasdf" }, { false, " the last one " } });
	}

	@Test
	public void testRercursive() {
		assertEquals("failed: " + string, isPalindrome, palindrome.recursiveCheck(string));

	}


	@Test
	public void testLoop() {
		assertEquals("failed: " + string, isPalindrome, palindrome.checkWithLoop(string));

	}

	// and the boilerplate - initialization

	boolean isPalindrome;
	String string;
	Palindrome palindrome = new Palindrome();

	public PalindromeTest(boolean isPalindrome, String string) {
		this.isPalindrome = isPalindrome;
		this.string = string;
	}

}
