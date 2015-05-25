package loop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhileTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSimpleWhile() {
		assertEquals("", While.simpleWhile(0, 'x'));
		assertEquals("xx", While.simpleWhile(2, 'x'));
		assertEquals("mmmmmm", While.simpleWhile(6, 'm'));
	}

	@Test
	public void testWhile() {
		Condition c = new Condition() {
			@Override
			public boolean isTrue(int n) {
				return n > 0;
			}
		};
		assertEquals("xx", While.whileLoop(c,2, 'x'));
		assertEquals("mmmmmm", While.whileLoop(c,6, 'm'));
		assertEquals("", While.whileLoop(c,0, 'x'));
		}
}
