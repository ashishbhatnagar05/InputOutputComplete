package coreIOJava6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFileIO {

	public void writingFileUsingBufferedInputStream(String filename) throws IOException {
		File file = createFile(filename);
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			String str = "ashish is a dude";
			fileOutputStream.write(str.getBytes());
			fileOutputStream.flush();
			System.out.println("String written to file: " + str);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	private File createFile(String fileName) throws IOException {
		File file = new File(System.getProperty("user.dir"), fileName);
		if (file.createNewFile()) {
			System.out.println("A new file is created at location: " + file.getAbsolutePath());
		} else {
			System.out.println("File already exist at: " + file.getAbsolutePath());
		}
		return file;
	}
}
