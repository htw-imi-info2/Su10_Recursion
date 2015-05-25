package countFiles;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountFilesTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * this is no unit test as it depends on resources on the file system 
	 */
	@Test
	public void test() {
		assertEquals(3, new CountFiles().countFiles("testdata/countFiles"));

	}

}
