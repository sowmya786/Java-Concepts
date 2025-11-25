package Basics;

	//memory space is not allocated when we create a class (Single line comment)
	public class Basics { 
		
		//Global variables - scope is through out the program
		
		String s="I'm sowmya";
		int i = 123;
		char c = 'a';        //Stores a single character
		double d = 123.45;  //Stores fractional numbers, 15 decimal digits
		float f = 67.89f;  //Stores fractional numbers, 6 to 7 decimal digits
		boolean b = true; //Stores true or false values
		
		
		public void method()
		/* As this method is not static we can create an object (Multi line comment) */
		
		{
			System.out.println("Hi,"+s);
			System.out.println(i); //prints integer  
			System.out.println(c); //prints character  
			System.out.println(d); //prints integer  
			System.out.println(f); //prints character   
			
		}
		
		public void localVariable()
		{
			//local variable- scope is limited within a method
			int i =123;  
			System.out.println(i);
			
		}
		
		public static void main(String[] args) {
			/** As the method is non static we can create an object
			 * and memory gets allocated (Documentation comment)
			 */
		
			Basics ref = new Basics();
			ref.method();
			
			
		}

	}



