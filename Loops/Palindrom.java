package Loops;

import java.util.Scanner;

public class Palindrom {

	public static void main(String args[]){  
		  int r,sum=0,temp; 
		  int num; 
		  
		  Scanner in = new Scanner(System.in);
	        System.out.println("Enter an Integer:");
	        num = in.nextInt();
	        
		  temp=num;    
		  while(num>0){    
		   r=num%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

