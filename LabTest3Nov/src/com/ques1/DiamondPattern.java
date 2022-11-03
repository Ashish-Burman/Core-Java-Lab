/*
 * Program - To make diamond pattern using loops
 * @Author - Ashish Burman
 * @Date - 3 Nov 2022
 */

//declaring package
package com.ques1;

import java.util.Scanner;

//declaring class
public class DiamondPattern 
{
	//method to create the diamond shape
	static void diamond(int rows)
	{
		//declaring variables
		int i,j;
			
		//To create upper part of the shape
		
		//loop start
		for(i = 1; i <= rows; i++)
		{
			System.out.println();
				
			//loop start
			for(j = rows; j >= i; j--)
			{
				System.out.print(" ");
			}
			//end of loop
				
			//loop start
			for(j = 1; j <= i; j++)
			{
				System.out.print(" *");
			}
			//end of loop
		}
		//end of loop
			
		//To create lower part of the shape
		
		//loop start
		for(i = rows; i >= 1; i--)
		{
			System.out.println();
				
			//loop start
			for(j = i; j <= rows; j++)
			{
				System.out.print(" ");
			}
			//end of loop
			
			//loop start
			for(j = i; j >= 1; j--)
			{
				System.out.print(" *");
			}
			//end of loop
		}
		//end of loop
	}
	//end of method
		
	//main method
	public static void main(String[] args)
    {
		//local variables
		int r;
		
		//creating object of scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input 
		System.out.println("Enter the number of rows:");
		r = sc.nextInt();
		
		//calling method
	    diamond(r);
	    
	    sc.close();
    }
	//end of main
}
//end of class