/*
 * Program: To make a calculator with exception handling
 * Author: Ashish Burman
 * Date: 17 Nov 2022
 */

//declaring packages
package com.ques4;

//importing packages
import java.util.Scanner;

//declaring class
public class Calculator
{
	//main method
	public static void main(String args[])
	{
		//declaring variables
		int number1, number2, result;
		char choice;
		
		//creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input of two numbers
		System.out.println("Enter two numbers:");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
				
		//try block
		try 
		{
            //menu for calculation
			System.out.println("*** Menu ***");
            System.out.println("+ -> Addition");
            System.out.println("- -> Subtraction");
            System.out.println("* -> Multiplication");
            System.out.println("/ -> Quotient");
            System.out.println("% -> Remainder");
            System.out.println("@ -> Exit");
            System.out.println("Enter your option: ");
            choice = sc.next().charAt(0);
            
            //start of switch
            switch (choice)
            {
            
            case '+': 
            	System.out.println("!!! Addition !!!");
            	//calculating sum
        		result = number1+number2;
        		//printing the sum
        		System.out.println("The sum is = " + result);
        		break;
        		
            case '-':
            	System.out.println("!!! Subtraction !!!");
            	//calculating difference
        		result = number1-number2;
        		//printing the difference
        		System.out.println("The difference is = " + result);
        		break;
        		
            case '*':
            	System.out.println("!!! Multiplication !!!");
            	//calculating product
        		result = number1*number2;
        		//printing the product
        		System.out.println("The product is = " + result);
        		break;
        		
            case '/':
            	System.out.println("!!! Quotient !!!");
            	//calculating quotient
        		result = number1/number2;
        		//printing the quotient
        		System.out.println("The quotient is = " + result);
        		break;
        		
            case '%':
            	System.out.println("!!! Remainder !!!");
        		//calculating remainder
        		result = number1%number2;
        		//printing the remainder
        		System.out.println("The remainder is = " + result);
        		break;
        		
            case '@':
            	System.out.println("!!! Thank You !!!");
            	System.exit(0);
            	break;
            }
            //end of switch
		}
		//end of try
		
		//catch block
		catch (Exception e)
		{
            System.out.println("Wrong input. Try again.");
		}
        //end of catch    
        sc.close();
	}
	//end of main
}
//end of class