/*
 * Program: To add money in the piggy bank
 * @Author: Ashish Burman
 * @Date: 03 Nov 2022
 */

//declaring package
package com.ques3;

//import scanner class
import java .util.Scanner;

//declaring class
public class Amount
{
	//main method
	public static void main(String[] args)
	{
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the amount");
		double amount= sc.nextDouble();

		//creating object of class PiggyBank
		PiggyBank p1=new PiggyBank(amount);
		System.out.println("Enter the amount to add");
		double addAmount= sc.nextDouble();
		p1.setAmount(addAmount);
		System.out.println(p1);
		
		sc.close();
	}//end main 
}
//end of class