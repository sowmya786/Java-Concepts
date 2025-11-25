package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException extends Exception 
{

	public static void main(String[] args) throws IOException, FileNotFoundException 
	{
		 File file = new File("test.txt");
	        FileInputStream fis = null;
	        try {
	            fis = new FileInputStream(file);
	            fis.read();
	            fis.close();
	        }
	        //FileNotFoundException is a subclass of IOException.
	       
	         catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
	

	}


