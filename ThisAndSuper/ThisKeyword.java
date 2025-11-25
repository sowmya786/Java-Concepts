/* 1. Print the fields/instance members of the current class using this and without using object
 * 3. Call constructor of the current class using this()
 * 4. Call argument constructor of current class using this()
 */

package ThisAndSuper;

public class ThisKeyword {
		
		    
		    String name;
		    int num;

		    ThisKeyword()
		    {
		    	
		    // Calling argument constructor of current class using this()
		        this("selenium", 4);
		    }

		    ThisKeyword(String name,int num) 
		    {
		        //Printing fields of the current class using this
		        this.num = num;
		        this.name = name;
		        System.out.println(num + " " + name);
		    }
		    public class This
		    {
		    public static void main(String[] args)
		    {
		        ThisKeyword ts1 = new ThisKeyword();
		        ThisKeyword ts = new ThisKeyword ("selenium", 3);
		        
		    }
		}
	}


