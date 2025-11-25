// 2. Write a function to calculate the average value of an array of integers
// 3. Write a program to find the index of an array element
// 4. Write a function to test if array contains a specific value
// 5.Write a function to remove a specific element from an array
// 6. Write a function to copy an array to another array
// 7. Write a function to insert an element at a specific position in the array
// 8. Write a function to find the minimum and maximum value of an array
// 11.Write a program to find the common values between two arrays
// 12. Write a method to remove duplicate elements from an array
// 16. Write a function to get the difference of largest and smallest value
// 17. Write a method to verify if the array contains two specified elements(12,23)
// 18. Write a program to remove the duplicate elements and return the new array
// 19. Write a function to find the missing number of sorted array of 1 to 100
package Array;

import java.util.Arrays;

public class MaxAndMin {
	
		static void difference(int[] a) {
	        int max = a[0];
	        int min = a[0];
	        int diff;
	        for (int i = 1; i < a.length; i++) 
	        {
	            
	            if (a[i] > max) {
	                max = a[i];
	            
	            } else if (a[i] < min) {
	                min = a[i];
	            }
	        }
	       
	        diff = max - min;
	       
	        System.out.println("Difference of largest and smallest values : " + diff);
	    }
	
		  static int minValue(int[] a) 
		  {
		        
		        int min = a[0];
		       
		        for (int j : a)
		            if (j < min)
		                min = j;
		        return min;
		    }
		  
		   static int maxValue(int[] a) {
		        
		        int max = a[0];
		       
		        for (int j : a)
		            if (j > max)
		                max = j;
		        return max;
		    }
		   
		   static void commonValues(int[] array, int[] array1) {
		        
		        for (int k : array) {
		           
		            for (int i : array1) {
		               
		                if (k == i) {
		                    
		                    System.out.println("Common values : " + k);
		                }
		            }
		        }
		    }
		   
		   static int removeDuplicate(int[] arr, int n)
		   {
		        if (n == 0 || n == 1) 
		        {
		            return n;
		        }
		       
		        int[] temp = new int[n];
		        int j = 0;
		        for (int i = 0; i < n - 1; i++) {
		            if (arr[i] != arr[i + 1]) {
		                temp[j++] = arr[i];
		            }
		        }
		        temp[j++] = arr[n - 1];
		       
		        for (int i = 0; i < j; i++) {
		            arr[i] = temp[i];
		        }
		        return j;
		    }
		   
		   public class ContainsSpecificValue 
		   {			    
			    static boolean contains(int[] arr, int n) 
			    {		       
			        for (int i : arr) 
			        {            
			            if (i == n)
			            {
			                return true;
			            }
			        }
			        return false;
			    }
			    
			    
			    static void arrayIndex(int[] array, int n) 
			    {
			        for (int i = 0; i < array.length; i++)
			        { 
			            if (n == array[i])
			            {
			                System.out.println(n + " is at index " + i);
			                return;
			            }
			    }
			    }
			    
			    static void containsElement(int[] array, int n1,int n2)
			    {
			        boolean num1 = false;
			        boolean num2 = false;
			       
			        for (int i : array) 
			        {
			           
			            if (i == n1)
			            {
			                num1 = true;
			            }
			           
			            if (i==n2)
			            {
			                num2 = true;
			            }
			        }
			       
			        if (num1)
			        {
			            System.out.printf("Contains %d in the array", n1);
			        } 
			        else 
			        {
			            System.out.printf("Doesn't Contain %d in the array", n1);
			        }
			       
			        if (num2)
			        {
			            System.out.printf("Contains %d in the array", n2);
			        } 
			        else 
			        {
			            System.out.printf("\nDoesn't Contain %d in the array", n2);
			        }
			        System.out.println("\nmy_arr[] = " + Arrays.toString(array));
			    }
			    
			    public static int[] removeElement(int[] array, int index)
			    {
			       
			        if (array == null || index < 0 || index >= array.length) 
			        {
			            return array;
			        }
			       
			        int[] newArray = new int[array.length - 1];
			       
			        for (int i = 0, k = 0; i < array.length; i++) 
			        {
			           
			            if (i == index)
			            {
			                continue;
			            }
			           
			            newArray[k++] = array[i];
			        }
			        
			        return newArray;
			    }

			    static void insertValue(int[] array, int index, int value) 
			    {
			        for (int i = array.length; i <= index; i--) 
			        {
			            array[i] = array[i - 1];
			        }
			        
			        array[index] = value;
			    }
			    
			    static void averageOfArray(int[] arr)
			    {
			        int sum = 0;
			       
			        for (int i : arr) 
			        {
			           
			            sum = sum + i;
			        }
			       
			        int average = sum / arr.length;
			       
			        System.out.print("The Average value of array is " + average);
			    }

			    static void copyArray(int[] array)
			    {
			       
			        int[] copy = array;
			        
			        System.out.println("Array after copying to c = " + Arrays.toString(copy));
			    }
			    
			    static void missingNumber(int[] array) 
			    	{
			        Arrays.sort(array);
			        
			        System.out.println("a[] = " + Arrays.toString(array));
			        
			        int j = 0;
			        
			        for (int i = 1; i < 100; i++)
			        {
			            if (j < array.length && i == array[j])
			                j++;
			            else
			                System.out.print(i + " ");
			        }
			    }
	   public static void main(String[] args) {
	 
	        int[] array = {1,2,4,5,6,7,12};
	        int[] array1 = {6,7,9,10,11};
	        int[] array3 = {15,30,45,55,80,90,100};
	        int a = 1;
	        int index = 3;
	        int value = 20;
	        
	        
	        System.out.println("array arr[] = " + Arrays.toString(array));
	        
	        int n = array.length;
	        
	       
	        difference(array);
	        
	     
	        System.out.println("my_arr = " + Arrays.toString(array));
	        
	        System.out.println("The Maximum value = " + maxValue(array));
	    
	        System.out.println("The Minimum value = " + minValue(array));
	        
	        System.out.println("array[] = " + Arrays.toString(array));
	        System.out.println("array1[] = " + Arrays.toString(array1));
	       
	        commonValues(array, array1);
	        
            n = removeDuplicate(array, n);
	        
	        System.out.println("Array after removing duplicates : ");
	        
	        for (int i = 0; i < n; i++)
	        {
	            System.out.print(array[i] + " ");
	            
	            boolean hasValue = contains(array, a);
	            
	            if (hasValue) 
	            {
	                System.out.println("Contains " + a + " in the array");
	                System.out.println(Arrays.toString(array));
	            } 
	            else 
	            {
	                System.out.println("Does not Contains " + a + " in the array");
	                System.out.println(Arrays.toString(array));
	             
	                System.out.println("index of an array element:");
	                arrayIndex(array, 2);
	                
	                System.out.println("verifying if the array contains two specified elements:");
	                containsElement(array, 12,23);
	                
	                System.out.println("Array after removing an Element at index " + index );
	               
	                array = removeElement(array, index);
	                
	                System.out.println("Array after Inserting value : ");

	                insertValue(array, index, value);
	                
	                System.out.print("The Average value of array is " );
	                averageOfArray(array);
	                
	                int[] newarray = new int[n];
	                
	                for (int k = 0; k < n; k++)
	                {
	                	System.out.printf("new array= ", k);
	                }
	                System.out.println("new array = " + Arrays.toString(newarray));
	                
	                copyArray(newarray);
	                
	                System.out.println("missing numbers between" );
	                missingNumber(array3);
	                
	                
	            }
	        }
	      
	    }
	    }
		   
}
