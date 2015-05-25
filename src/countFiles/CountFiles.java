package countFiles;

import java.io.File;
import java.nio.file.Paths;

public class CountFiles {

	public static int countFiles(File f) {
		if (f.isFile()) {
			return 1;
		}

		// Count children & recurse into subdirs:
		int count = 0;
		File[] files = f.listFiles();
		for (File fileOrDir : files) {
			count += countFiles(fileOrDir);
		}
		return count;
	}

	/**
	 * convenience method to call with a string containing the path name
	 * 
	 * @param string
	 */
	public int countFiles(String string) {
		return countFiles(Paths.get(string).toFile());
	}
}
