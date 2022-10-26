/*
 * Program - To check eligibility to sit in the exam
 * @Author - Ashish Burman
 * @Date - 26 Oct 2022
 */

//declaring package
package com.ques1;

//importing packages
import java.util.Scanner;


//declaring class
public class Attendance 
{
	//instance variables
    float classAttended, totalClass,percentage;
		
		//method to get details
    public void getDetails(float ca, float tc)
	    {
		
    	classAttended = ca;
		totalClass = tc;
		
	    }
    
  //method to calculate attendance and print result 
  	public void printDetails()
  	{
		
		//calculating attendance
		percentage = (classAttended/totalClass)*100;
		
		//checking the eligibility for the exam
		if(percentage>=75)
           	System.out.println("Congratulations!!! You are eligible to give the exam with percentage: "+percentage);
   
        else
	        System.out.println("Sorry!!! You are not eligible to give the exam as your percentage is: "+percentage);
        //end of IfElse			 
	
	 }
     //end of method

//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		//creating object of class
				Attendance a = new Attendance();
				
		// taking input
		System.out.println("Enter the total number of classes been held:");
		float total = sc.nextFloat();
		System.out.println("Enter the number of classes you have attended:");
		float attended = sc.nextFloat();
		
		//calling the method getDetails
				a.getDetails(attended,total);
				
				//calling the method printDetails
				System.out.println("---------------------------------");
				a.printDetails();
				System.out.println("---------------------------------");
				sc.close();
			
    }
    // end of main
}
// end of class 
		