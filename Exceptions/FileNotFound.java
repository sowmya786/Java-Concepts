package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args)
	{
		// Try block to check for exceptions
		 try {
			 FileReader fileReader = new FileReader("invaild file path.txt");  
			 BufferedReader bufferReader = new BufferedReader(fileReader);
	           
	        }
	       
		 // Catch block to handle exceptions
	        catch (FileNotFoundException e)
		 {
	            System.err.println("FileNotFoundException");
	           
	            e.printStackTrace();
	        }
	    }
	}


