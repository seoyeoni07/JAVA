package basic.File;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Windows\\system.ini");
		
		int i;
		while( (i = fis.read()) != -1) {	// -1 : EOF(end of file)
			System.out.print((char)i);
		}
		
	}
}


