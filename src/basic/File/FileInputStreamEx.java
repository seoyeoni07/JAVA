package basic.File;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("C:\\Windows\\system.ini");
		
		int i;
		while( (i = fis.read()) != -1) {	// -1 : EOF(end of file)
			System.out.print((char)i);
		}
		
	}
}


