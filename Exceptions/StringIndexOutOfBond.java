package Exceptions;

public class StringIndexOutOfBond {

	public static void main(String[] args) {
	
		
		 String str = "Selenium";
	       
	      for(int i=0; i<str.length(); i++)
	      {
	         System.out.println(str.charAt(i));
	      }
	      System.out.println(str.length());
	      
	      //Accessing element at greater than the length of the String
	      try
	      {
	         System.out.println(str.charAt(10));
	         
	      }
	      catch(StringIndexOutOfBoundsException e)
	      {
	         System.out.println("StringIndexOutOfBond Exception occurred");
	      }
	   
	}
	}


