package indirect;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OddEvenTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test5() {
		assertEquals(true, OddEven.isOdd(5));
	}

	@Test
	public void test6() {
		assertEquals(true, OddEven.isEven(6));
	}

	@Test
	public void test18() {
		assertEquals(false, OddEven.isOdd(18));
	}

	@Test
	public void test13() {
		assertEquals(false, OddEven.isEven(13));
	}
}
