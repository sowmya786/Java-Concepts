package Collections;
import java.util.Iterator;
public class ArrayList
{
	public static void main(String[] args)
	{	
		 java.util.ArrayList<String> list = new java.util.ArrayList<>();
		 //Add an element to the ArrayList
		 //Create an ArrayList of type String with 10 string elements
		 list.add("get");
		 list.add("sendkeys");
		 list.add("getAttribute");
		 list.add("getTagName");
		 list.add("getText");
		 list.add("getSize");
		 list.add("close");
		 list.add("quit");
		 list.add("getTitle");
		 list.add("getCurrentUrl");
		 
		 // Add an element at a specific index
		 list.add(1, "getPageSource");
		 System.out.println("list = " + list);		
		 
		 //Remove an element from the ArrayList, Remove at an index
		 list.remove(1);
		 System.out.println("list = " + list);
		 
		// Update the element at a specific index
		 list.set(1, "fetch");
		 System.out.println("list = " + list);
		 
		// Checking the element is present at a particular index using indexOf() method
		 System.out.println(list.indexOf("sendkeys"));
		 System.out.println("list = " + list);
		 
		 //Finding the size of the ArrayList using size() method
		 System.out.println(list.size());
		 
		 //Getting an element at a particular index
		 System.out.println(list.get(1));
		 
		 
		 //Checking the element is present in the ArrayList using contains() method
		 System.out.println(list.contains("get"));
		 
		 list.clear();
	     
		 
		 // Iterate through the ArrayList by using Iterator object
		 Iterator<String> itr = list.iterator();
	        System.out.println("ArrayList: ");
	        while (itr.hasNext()) {
	            System.out.println(itr.next() + " ");
	        }
	    
	        }
				
	}

