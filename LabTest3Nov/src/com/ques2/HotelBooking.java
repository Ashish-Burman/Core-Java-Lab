/*
 * Program - To calculate the room charge and print the total price
 * @Author - Ashish Burman
 * @Date - 03 Nov 2022
 */

//declaring package
package com.ques2;

import java.util.Scanner;

//creating class
public class HotelBooking 
{
    //main method
	public static void main(String[] args)
	{
		//local variables
		int choice = 0;
		int roomNumber = 0;
		String roomType = "";
		boolean acFacility = false;
		float roomArea = 0.0f; 
		float price = 0.0f;
		boolean ch = false;
		
		//creating object of Scanner
		Scanner sc = new Scanner(System.in);
        
		//creating object of class Hotel
		Hotel h = new Hotel();
		
		//menu
		System.out.println("Choose the type of room according to your need:");
		System.out.println("1. Normal");
		System.out.println("2. Standard");
		System.out.println("3. Delux");
		System.out.println("4. Exit");
		System.out.println("Enter the number (1 to 4)");
		choice = sc.nextInt();
		
		//switch case
		switch(choice)
		{
		case 1:
			System.out.println("You have chosen Normal room");
			System.out.println("Which room number do you want ? (101/102/103)");
			roomNumber = sc.nextInt();
			System.out.println("Do you want A.C. facility ? (true/false)");
			acFacility = sc.nextBoolean();
			System.out.println("Choose the room area: (150/175)");
			roomArea = sc.nextFloat();
			System.out.println("The price of this room is: Rs. 2500");
			price = 2500.0f;
			Hotel h1 = new Hotel(roomNumber, roomType, acFacility, roomArea, price);
			//condition for discount
			System.out.println("Do you have a discount card? (true/false)");
		    ch = sc.nextBoolean();
			if(ch == true)
				h.discount(price);
			break;
			
		case 2:
			System.out.println("You have chosen Standard room");
			System.out.println("Which room number do you want ? (201/202/203)");
			roomNumber = sc.nextInt();
			System.out.println("Do you want A.C. facility ? (true/false)");
			acFacility = sc.nextBoolean();
			System.out.println("Choose the room area: (200/225)");
			roomArea = sc.nextFloat();
			System.out.println("The price of this room is: Rs. 3000");
			price = 3000.0f;
			Hotel h2 = new Hotel(roomNumber, acFacility, roomArea);
			//condition for discount
			System.out.println("Do you have a discount card? (true/false)");
			ch = sc.nextBoolean();
			if(ch == true)
				h.discount(price);
			break;
			
		case 3:
			System.out.println("You have chosen Delux room");
			System.out.println("Which room number do you want ? (301/302/303)");
			roomNumber = sc.nextInt();
			System.out.println("Do you want A.C. facility ? (true/false)");
			acFacility = sc.nextBoolean();
			System.out.println("The room area is: 300");
			roomArea = 300.0f;
			System.out.println("The price of this room is: Rs. 3000");
			price = 3000.0f;
			Hotel h3 = new Hotel(roomNumber, roomType, acFacility, roomArea, price);
			//condition for discount
			System.out.println("Do you have a discount card? (true/false)");
			ch = sc.nextBoolean();
			if(ch == true)
				h.discount(price);
			break;
			
		case 4:
			System.out.println("!! Sorry to see you leave !!");
			System.exit(0);
			break;
			
			default:
				System.out.println("*** Invalid choice ***");
		}
		//end of switch
		
		
		sc.close();
	}
    //end of main
}
//end of class