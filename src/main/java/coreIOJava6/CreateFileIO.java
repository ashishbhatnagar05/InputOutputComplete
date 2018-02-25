package coreIOJava6;

import java.io.File;
import java.io.IOException;

public class CreateFileIO {

	public void createNewFile(String fileLocation) throws IOException {
		File file = new File(fileLocation);
		if (file.createNewFile()) {
			System.out.println("A new file is created at location: " + fileLocation);
		} else {
			System.out.println("File already exist at: " + fileLocation);
		}
	}

	public void createNewFileUsingFileSeparator(String filename) throws IOException {
		String absoluteFilePath = System.getProperty("user.dir") + System.getProperty("file.separator") + filename;
		File file = new File(absoluteFilePath);// file will be created at root of this project
		if (file.createNewFile()) {
			System.out.println("A new file is created at location: " + absoluteFilePath);
		} else {
			System.out.println("File already exist at: " + absoluteFilePath);
		}
	}

	public void createNewFileUsingNewFileConstructor(String fileName) throws IOException {
		File file = new File(System.getProperty("user.dir"), fileName);
		if (file.createNewFile()) {
			System.out.println("A new file is created at location: " + file.getAbsolutePath());
		} else {
			System.out.println("File already exist at: " + file.getAbsolutePath());
		}
	}

}
