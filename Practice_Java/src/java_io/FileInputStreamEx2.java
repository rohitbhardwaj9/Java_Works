package java_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		StringBuffer content = null;
		
		int ch;
		try {
			content = new StringBuffer();
			fis = new FileInputStream("C://Data//data.txt");
			
			while((ch = fis.read()) != -1) {
				content.append((char)ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception Thrown: "+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Thrown: "+e);
		}
		finally {
			try {
				System.out.println(content);
				fis.close();
			} catch (IOException e2) {
				System.out.println("Exception thrown: " +e2);
			}
		}

	}

}
