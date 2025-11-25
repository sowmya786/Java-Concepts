/*1. Write a program to generate Arithmetic Exception without exception handling
2. Handle the Arithmetic exception using try-catch block 
4. Write a program with multiple catch blocks
5. Write a program to throw exception with your own message
7. Write a program with finally block
8.Write a program to generate Arithmetic Exception*/

package Exceptions;

public class ArithmeticException {

	public static void main(String[] args) 
	{
		int a = 20; 
		int b = 0;
		int c;
		
		// Try block to check for exceptions
		try 
		{
            c = a / b;
            System.out.println("c = " + c);
		
	}
		 // Catch block to handle exceptions
		
		 catch (java.lang.ArithmeticException e)
		{
	            System.out.println("Arithmetic exception using try-catch block");
		}
	  catch (ArrayIndexOutOfBoundsException e)
		{
         System.out.println("ArrayIndexOutOfBounds Exception occurs");
         e.getStackTrace();
	  }
      catch (Exception e) 
		{
         System.out.println("Parent Exception occurs");
         e.getStackTrace();
     }
		
		finally
		{
            System.out.println("finally block is always executed");
        }
		
		   c = a / b;
	        System.out.println("without exception handling");
		

}
}