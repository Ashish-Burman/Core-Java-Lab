/*
 * Program: To implement exception handling in a menu
 * Author: Ashish Burman
 * Date: 17 Nov 2022
 */

//declaring packages
package com.ques3;

//importing packages
import java.util.Scanner;

//declaring class
public class ExceptionHandling 
{
    //method to print the menu
	void Menu()
	{
		System.out.println("enter your choice");
		System.out.println("1.tennis");
		System.out.println("1.tennis");
		System.out.println("1.tennis");
	}
	//end of method
	
	//main method
	public static void main(String[] args) 
	{
		//creating object for class
		ExceptionHandling eh = new Exceptionhandling();
		//calling method
		eh.Menu();
		
		//try block
		try
		{
		//creating object for Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input
		int choice = sc.nextInt();
		System.out.println(choice);
		
		sc.close();
	    }
        //end of try
		
	    //catch block
		catch(ArithmeticException |  InputMismatchException e)
	    {
			System.out.println(e.getMessage());
	    }
		//end of catch
	}
    //end of main
}
//end of class