package Loops;

import java.util.Scanner;

public class EqualOperator {

		 public static void main(String[] args)
		    {
		        //Scanner class object created
		        Scanner in=new Scanner(System.in);
		        
		        //Taking input of 2 numbers
		        System.out.println("Enter any two numbers: ");
		        
		        int n1=in.nextInt();
		        int n2=in.nextInt();
		        
		        //checking if two numbers are equal
		        if(n1==n2)
		        {
		            System.out.println("Two numbers are equal");
		        }
		        else
		        {
		              System.out.println("Two numbers are not equal");  
		        }
		    }
		}

	


