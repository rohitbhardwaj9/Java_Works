package java_io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C://Data//data.txt");
		StringBuffer content = new StringBuffer();
		
		int ch;
		
		while((ch = fis.read()) != -1) {
			content.append((char)ch);
		}
		
		System.out.println(content);
		fis.close();
	
	}

}
