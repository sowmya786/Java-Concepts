package Exceptions;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3};
		
		// Try block to check for exceptions
		 try {
	            System.out.println(a[4]);	            
	           
	         //   System.out.println(b[4]); 	            
	        }
		 
		 //Catch block to handle exceptions
		 
	        catch (ArrayIndexOutOfBoundsException e)
		 {
	            System.err.println("ArrayIndexOutOfBoundsException");
	            
	         // Displays exceptions on console along with
	         // line number using printStackTrace() method
	            e.printStackTrace();
	        }
	}

}
