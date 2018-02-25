package coreIOJava6;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class ReadingFileIOTest {
	private ReadingFileIO sut;

	@Before
	public void setup() {
		sut = new ReadingFileIO();
	}

	@Test
	public void readingFileUsingBufferedInputStreamTest() throws IOException {
		String filename = "newfile.txt";
		sut.readingFileUsingBufferedInputStream(filename);
	}
	
	@Test
	public void readingFileUsingBufferedReaderTest() throws IOException {
		String filename = "newfile.txt";
		sut.readingFileUsingBufferedReader(filename);
	}
}
