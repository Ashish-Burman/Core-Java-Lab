/*
 * Program: To get car model and its name, and make it constant
 * Author: Ashish Burman
 * Date: 10 Nov 2022
 */

//declaring package
package com.ques4;

import java.util.Scanner;

//declaring class
public class Car 
{
	//main method
	public static void main(String[] args)
	{
        //declaring variables
		String name;
		int model;
		
		//creating object for Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input car model and its name
		System.out.println("Enter the name of car and model:");
		name = sc.next();
		model = sc.nextInt();
		
		//printing process
		System.out.println("Name of the Car is: "+name);
		System.out.println("Model of the Car is: "+model);
		
		sc.close();
	}
    //end of main
}
//end of class