package reverse;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This contains also an example on how to test a method that writes to system
 * out. got this from
 * http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
 * 
 * I would prefer, however, to write code that is easier testable - e.g.
 * produces a string first or takes the stream it writes to as an parameter.
 * 
 * @author kleinen
 *
 */
@RunWith(Parameterized.class)
public class ReverseStringTest {

	@Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] {
				{ "Not yet implemented", "detnemelpmi tey toN" }, { "", "" },
				{ "a", "a" } });
	}

	String string;
	String reversed;

	public ReverseStringTest(String string, String reversed) {
		this.string = string;
		this.reversed = reversed;
	}

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	public void testReversePrinter() {
		ReversePrinter.print(string);
		assertEquals("failed: " + string, reversed,
				new String(outContent.toByteArray()));
	}

	@Ignore
	public void testSmart() {
		new SmartReversePrinter().print(string);
		assertEquals("detnemelpmi tey toN",
				new String(outContent.toByteArray()));
	}

	@Test
	public void testSmartFixed() {
		new SmartReversePrinterFixed().print(string);
		assertEquals("failed: " + string, reversed,
				new String(outContent.toByteArray()));
	}

	@Test
	public void testSmartFixedLean() {
		new SmartReversePrinterFixed().printLean(string);
		assertEquals("failed: " + string, reversed,
				new String(outContent.toByteArray()));
	}

}
