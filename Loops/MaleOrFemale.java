package Loops;
//Print gender (Male/Female) program according to given M/F using switch.
import java.util.Scanner;

public class MaleOrFemale {

		public static void main(String[] args) {

	        System.out.print("Enter gender (M/m or F/f): ");
	        Scanner sc = new Scanner(System.in);
	        //The Java String class "charAt()" method returns a char value at the given index number.
	        char Gender = sc.next().charAt(0);
	        
	        switch (Gender) {
	          
	            case 'M':
	            case 'm':
	                System.out.println("Gender is Male");
	                break;
	                
	            case 'F':
	            case 'f':
	                System.out.println("Gender is Female");
	                break;
	        }
	    }
	}
	

