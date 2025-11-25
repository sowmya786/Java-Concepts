package Exceptions;

public class ClassNotFound {

	public static void main(String[] args) 
	{
	
		
		// Try block to check for exceptions
        try {
 
            Class.forName("Exception");
        }
 
        // Catch block to handle exceptions
        catch (ClassNotFoundException ex) {
 
            // Displaying exceptions on console along with
            // line number using printStackTrace() method
            ex.printStackTrace();
        }
    }


	}


