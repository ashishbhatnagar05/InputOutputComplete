package coreIOJava6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileIO {

	public void writingFileUsingFileOutputStream(String filename) throws IOException {
		File file = createFile(filename);
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);// new FileOutputStream(file,true); to append to original file
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

	public void writingFileUsingBufferedWriter(String filename) throws IOException {
		File file = createFile(filename);
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file);// new FileWriter(file.true);to append file
			bufferedWriter = new BufferedWriter(fileWriter);
			String str = "ashish is a dude using bufferedWriter";
			bufferedWriter.write(str);
			System.out.println("String written to file: " + str);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
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
