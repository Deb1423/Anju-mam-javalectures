/*
Program: Java program to print the duplicate entires , sort the arrays & then remove the duplicate array.
@Author:- Debjit Talukder.
@Date:- 22Sep, 2022.
*/

import java.util.Scanner;
import java.util.Arrays;

//Declaring the class
class SortremoveduplicateArray
{
	static void inputArray()// Input the elements
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int rows= sc.nextInt();
		
		
		int arr[]= new int[rows];// Creating an array
		
		System.out.println("Enter the elements:");
		
		
		for(int i=0;i<rows;i++)//loop for the entered element
		{
				
	     	arr[i]= sc.nextInt();
			
			
		}
		
        Arrays.sort(arr); // sorting the all elements which has been entered		

		System.out.println();
		
		System.out.println("Array elements are:");
         displayArray(arr);
		
		System.out.println();
		
		System.out.println("Removing Duplicate elements:");
        removeDuplicate(arr);
		
		
		
		
	}
	
	static void displayArray(int theArray[])// Displaying all the elements.
	{
		
	   System.out.println();
	
		for(int therow:theArray)
		{
		 System.out.print(therow+ "  ");
					
		}
		
	}
   
   static void removeDuplicate(int theArray[])
   {
	   int size= theArray.length;
	   int new_size;
	   if(size==0||size==1)
		   new_size=size;
	   
	   int temparr[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(theArray[i]!=theArray[i+1])
		   {
			   temparr[j++]=theArray[i];
		   }
	   }
	   temparr[j++]=theArray[size-1];
	   
	   //changed original array
	   for(int i=0; i<j;i++)
	   {
		   theArray[i]= temparr[i];
	   }
	   
	   
	   //printing removing duplicate entity.
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(theArray[i]+"  ");
	   }
   }

   public static void main(String ...args)
  {

     inputArray();

  }


} //end of the class