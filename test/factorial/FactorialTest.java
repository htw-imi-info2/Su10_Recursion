package factorial;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialTest {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 },
				{ 3, 6 }, { 4, 24 }, { 5, 120 } });
	}

	int n;
	int factorial;

	public FactorialTest(int n, int factorial) {
		this.n = n;
		this.factorial = factorial;
	}

	@Test
	public void testRecursive() {
		assertEquals(factorial,Factorial.factorial(n));
	}
	@Test
	public void testLoop() {
		assertEquals(factorial,Factorial.factorialLoop(n));
	}

}
