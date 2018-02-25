package coreIOJava6;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CreateFileIOTest {

	private CreateFileIO sut;

	@Before
	public void setup() {
		sut = new CreateFileIO();
	}

	// Need to run eclipse as administrator
	@Test
	public void createNewFileTest() throws IOException {
		String fileLocation = "c://newfile.txt"; // or use c:\\newfile.txt
		sut.createNewFile(fileLocation);
	}

	@Test
	public void createNewFileUsingFileSeparatorTest() throws IOException {
		String filename = "newfile.txt";//use src/test/resources/newfile.txt to create a test class
		sut.createNewFileUsingFileSeparator(filename);
	}

	@Test
	public void createNewFileUsingNewFileConstructorTest() throws IOException {
		String filename = "newfile.txt";
		sut.createNewFileUsingNewFileConstructor(filename);
	}

	@Test
	public void deleteFileTest() throws IOException {
		String filename = "newfile.txt";
		sut.deleteFile(filename);
	}
}
