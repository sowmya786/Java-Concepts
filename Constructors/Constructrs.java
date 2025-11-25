/*1. Write a class with a default constructor, one argument constructor and two argument constructors. 
Instantiate the class to call all the constructors of that class from a main class
2. Call the constructors(both default and argument constructors) of super class from a child class
3. Apply private, public, protected and default access modifiers to the constructor
4. Write constructors with return type int and String
5. Try to call the constructor multiple times with the same object */

package Constructors;

public class Constructrs 
{

	 int id;
	    String name;
	    int age;
	    String branch;
	    String college;

	    //default constructor
	    //constuctor should be same as class name
	    //Constructors doesnt return any return type if we declare it with return type it is still
	    // valid but it is considered as normal method
	    Constructrs()
	    {
	        System.out.println("Student Details");
	    }
	    

	    //one argument constructor
	    //public constructor
	    public Constructrs(int ageOfStudent)
	    {
	        age = ageOfStudent;
	        
	        System.out.println("Roll No : " + age);
	    }

	    //two argument constructor
	    //private constructor
	    private Constructrs(int id, String nameofStudent)
	    {
	      name = nameofStudent;
	        this.id = id;
	        System.out.println("Name : " + nameofStudent);
	        System.out.println("Branch : " + this.id);
	    }
	    
	    protected Constructrs(String branchOfStudent)
	    {
	        branch = branchOfStudent;
	        
	        System.out.println("branch : " + branchOfStudent);
	    }

	    
	    class ChildClass extends Constructrs 
	    {
	    	 ChildClass()
	    	 {
	    	        super();
	    	    }
	    	 
	    	 ChildClass(int age) 
	    	 {
	    	        super(age);
	    	    }
	    }
	    	 public class Constructors
	    	 {
	   
	    
	    public static void main(String[] args)
	    	{
	        //calling constructors from main class
	        //creating objects and passing values
	       Constructrs c = new Constructrs();
	       new Constructrs(12);
	       new Constructrs(1, "jala");
	       new Constructrs("Computer Science");
	       
	       //creating an object for childclass
	    /*   ChildClass ch = new ChildClass();	    
	       new ChildClass(25);
	       new ChildClass(); */
	       
	       
	    	       
	    }
	    	 }
}