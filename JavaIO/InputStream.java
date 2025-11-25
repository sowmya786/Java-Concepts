package JavaIO;

import java.io.FileInputStream;

public class InputStream {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("D:\\Java programs\\Programs\\JavaIO\\InputStream");
			int i;
			
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			// Closes the input stream
			fis.close();
		} catch (Exception e) {
			
			e.getStackTrace();
		}
	}
}


