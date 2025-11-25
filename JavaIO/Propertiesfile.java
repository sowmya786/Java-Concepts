package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesfile

{
	public static void main(String[] args) 
	{
	Properties prop = new Properties();
	{
		try {

			// Instantiating the FileInputStream for output file
			File f = new File("D:\\Java programs\\Programs\\JavaIO\\read.file");
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
			 System.out.println("URL " + prop.getProperty("URL"));

			fis.close();

		} 
		catch (Exception e)
		{

			e.printStackTrace();
		}
	}
	}
}