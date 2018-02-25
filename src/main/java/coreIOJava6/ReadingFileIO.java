package coreIOJava6;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileIO {

	public void readingFileUsingBufferedInputStream(String fileName) throws IOException {

		File file = createFile(fileName);
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		DataInputStream dataInputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			dataInputStream = new DataInputStream(bufferedInputStream);

			System.out.println("Output from the file:");
			while (dataInputStream.available() != 0) {
				System.out.println(dataInputStream.readLine());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				dataInputStream.close();
				bufferedInputStream.close();
				fileInputStream.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public void readingFileUsingBufferedReader(String fileName) throws IOException {
		File file = createFile(fileName);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String currentLine = "";

			System.out.println("Output from the file:");
			while ((currentLine = bufferedReader.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				fileReader.close();
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
