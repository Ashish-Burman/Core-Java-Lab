/*
 * Program: To print the common elements from two array records
 * Author: Ashish Burman
 * Date: 10 Nov 2022
 */

//declaring package
package com.ques1;

//importing packages
import java.util.Scanner;

//declaring class
public class StudentRecord
{
    
    //main method
	public static void main(String[] args) 
	{
		//declaring the arrays 
		String record1[] = new String[20];
		String record2[] = new String[20];
		String common[] = new String[10];
		
		//creating object for Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input for first record
		System.out.println("Enter 10 names in first record:");
		//loop start
		for(int i=0; i<10; i++)
		{
			record1[i] = sc.nextLine();
		}
		//end of loop
		
		//taking input for first record
		System.out.println("Enter 10 names in second record:");
		//loop start
		for(int i=0; i<10; i++)
		{
			record2[i] = sc.nextLine();
		}
		//end of loop
		
		//to find the common elements
		//outer loop
    	for(int i=0; i<record1.length; i++)
    	{
    		//inner loop
    		for(int j=0; j<record2.length; j++)
    		{
    			//condition
    			if(record1[i]==record2[j]) 
    			{
    				common[i]=record1[i];
    				break;
    			}
    			//end of if
    		}
    		//end of inner loop
    	}
    	//end of outer loop
    	
    	//printing the output
    	System.out.println("The common names are:");
    	//loop start
    	for(int i=0; i<common.length; i++)
    	{
    		System.out.println(common[i] + " ");
    	}
    	//end of loop
		
		sc.close();
	}
    //end of main
}
//end of class