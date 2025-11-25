package Strings;


import java.io.*;
import java.lang.*;
 
class Test {
    public static void main(String[] args)
    {
    	// 1. Different ways creating a string
        // Declare String without using new operator 
    	//using string literal
        String s = "java";
 
        // Prints the String.
        System.out.println("String s = " + s);
 
        // Declare String using new operator
        String s1 = new String("selenium");
 
        // Prints the String.
        System.out.println("String s1 = " + s1);
        
     // 2. Concatenating two strings using + operator
        
        System.out.println(s1.concat(" with java"));
      
     // 3. Finding the length of the string
        
        System.out.println(s1.length());
        
        System.out.println(s1.indexOf("e", 3));
        
        
     // 4. Extract a string using Substring
         
        System.out.println(s1.substring(2)); // gives end of the string
        System.out.println(s1.substring(2, 6));
        

     // 6. Matching a String Against a Regular Expression With matches()
             String fb = "cucumber with testng";
             // Testing if regex is present or not
             boolean match = fb.matches("(.*)String(.*)");
             System.out.println(match);
        
        //7. Comparing strings using the methods equals()
        
        System.out.println(s1.equals("selenium"));
        
       // 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo() and compareTo() */
        
        System.out.println(s1.equalsIgnoreCase("SELENIUM"));
        System.out.println(s1.startsWith("sel"));
        System.out.println(s1.endsWith("um"));
        System.out.println(s1.compareTo("selenium")); // compares ASCII
        
       
     // 9. Trimming strings with trim()
        String st = " Selenium with java  ";
        //trim method() Removes leading and trailing spaces
        String trm = st.trim();
        System.out.println("Trimmed : " + trm);
        
     // 5. Searching in strings using indexOf()
        System.out.println(trm.indexOf("e", 2));
        
        // 10. Replacing characters in strings with replace()
        System.out.println(st.replace("java","java script"));
        
     // 14. Converting to uppercase and lowercase
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());       
        
        
        

        
        
    }
} 
