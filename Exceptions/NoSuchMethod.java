package Exceptions;

	class E_14 
	{
	
	   public void addition(int a, int b) {
	        int c;
	        c = a + b;
	        System.out.println(c);
	    }
	}

	public class NoSuchMethod {
	    public static void main(String[] args) throws ClassNotFoundException {

	        try {
	            Class c = Class.forName("com.jala.exceptions.E_14");
	            
	            //There is no subtraction() method in class E_14
	            c.getDeclaredMethod("subtraction", int.class, int.class);
	        }
	        //Throws NoSuchMethodException
	        catch (NoSuchMethodException e) {
	           
	            e.printStackTrace();
	        }
	    }
	
			}

