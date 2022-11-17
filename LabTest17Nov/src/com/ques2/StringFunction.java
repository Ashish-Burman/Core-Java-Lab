/*
 * Program: To show 5 functions of String in JAVA
 * Author: Ashish Burman
 * Date: 17 Nov 2022
 */

//declaring packages
package com.ques2;

//importing packages
import java.util.Scanner;

//declaring class
public class StringFunction
{	
	//main method
	public static void main(String[] args) 
	{
		//declaring variables
		String name;
		int index;
		
		//creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input of a String
		System.out.println("Enter Your Name:");		
		name = sc.nextLine();    
		
		//1. To find the length of the String
		System.out.println("The total length of the given String is: " + name.length());
		
		//2. To change the String to Uppercase
		name = name.toUpperCase();
		System.out.println("The given String in Uppercase is: " + name);
		
		//3. To add another String in the given String
		name = name.concat(" IS A GOOD BOY");
		System.out.println("The new String is: " + name);
		
		//4. To remove extra blank spaces
		System.out.println("String after removing extra spaces is: " + name.trim());
		
		//5. To find the character present in particular index value
		System.out.println("Enter the index number:");
		index = sc.nextInt();
		System.out.println("The character present in this index value is: " + name.charAt(index-1)); 
		
		sc.close();	
	}
	//end of main
}
//end of class