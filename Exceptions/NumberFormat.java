package Exceptions;

public class NumberFormat {

	public static void main(String[] args)
	
	{
	        String str = "selenium3.0";
		        try 
		        {
		            // Converting string with inappropriate format
		            int x = Integer.parseInt(str);
		            int y = Integer.valueOf(str);
		        } 
		        
		        catch (NumberFormatException e)
		        {
		            System.err.println("NumberFormatException caught!");
		            
		            e.printStackTrace();
		        }
	}

}
