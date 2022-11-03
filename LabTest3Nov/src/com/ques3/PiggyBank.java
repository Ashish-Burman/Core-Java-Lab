/*
 * Program: To create a piggy bank
 * @Author: Ashish Burman
 * @Date: 03 Nov 2022
 */

//declaring package
package com.ques3;

//declaring class
public class PiggyBank 
{
	//instance variables
	private double amount;

	//default constructor
	public PiggyBank() 
	{
		super();
		System.out.println("default constructor");
		this.amount=50;
	}
	//end of default constructor

    // parameterized constructor 
	public PiggyBank(double amount)
	{
		super();
        this.amount= amount;
	}
	//end of parameterized constructor 
	
    //method to get amount
	public double getAmount()
	{
		return amount;
	}
	//end of method
	
    //method to add amount
	public void setAmount(double amount)
	{
		this.amount+= amount;
	}
	//end of method

	@Override
	public String toString()  
	{
		return "totalamount=" + amount ;
	}

}
//end of class