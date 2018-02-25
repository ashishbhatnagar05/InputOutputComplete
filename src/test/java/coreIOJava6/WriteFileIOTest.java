package coreIOJava6;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class WriteFileIOTest {
	private WritingFileIO sut;

	@Before
	public void setup() {
		sut = new WritingFileIO();
	}

	@Test
	public void writingFileUsingBufferedInputStreamTest() throws IOException {
		String filename = "newfile.txt";
		sut.writingFileUsingFileOutputStream(filename);
	}

	@Test
	public void writingFileUsingBufferedWriterTest() throws IOException {
		String filename = "newfile.txt";
		sut.writingFileUsingBufferedWriter(filename);
	}
}
