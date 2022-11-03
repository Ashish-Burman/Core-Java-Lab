/*
 * Program - To calculate the room charge and print the total price
 * @Author - Ashish Burman
 * @Date - 03 Nov 2022
 */

//declaring package
package com.ques2;

//creating class
public class Hotel 
{
	//instance variables
	int roomNumber;
	String roomType;
	boolean acFacility;
	float roomArea, price;
	
	//default constructor
	public Hotel() 
	{
		super();
		System.out.println("!! Welcome To Our Hotel !!");
		this.roomNumber = 101;
		this.roomType = "Normal";
		this.acFacility = false;
		this.roomArea = 150.0f;
		this.price = 2500.0f;
	}
	//end of default constructor

	//parameterized constructor
	public Hotel(int roomNumber, boolean acFacility, float roomArea) 
	{
		super();
		this.roomNumber = roomNumber;
		this.acFacility = acFacility;
		this.roomArea = roomArea;
		this.roomType = "Standard";
		this.price = 3000.0f;
	}
    //end of parameterized constructor
	
	//parameterized constructor
	public Hotel(int roomNumber, String roomType, boolean acFacility, float roomArea, float price) 
	{
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.acFacility = acFacility;
		this.roomArea = roomArea;
		this.price = price;
	}
	//end of parameterized constructor
	
	//method to calculate discount
	void discount(float discountRate)
	{
		float discountedPrice = (discountRate/price)*100;
		System.out.println("The price after applying discount is: Rs." + discountedPrice);
	}
	//end of method
}
//end of class