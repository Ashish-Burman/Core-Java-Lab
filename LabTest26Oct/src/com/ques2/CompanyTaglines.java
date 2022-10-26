/*
 * Program - To print taglines of IT Companies
 * @Author - Ashish Burman
 * @Date - 26 Oct 2022
 */

//declaring package
package com.ques2;

//importing packages
import java.util.Scanner;

//declaring class
public class CompanyTaglines 
{

	//instance variables
	String companyName;
	
	//method to take company name
	public void nameCompany(String n) 
	  {

		companyName = n;

	  }//end method
	  
	//method to print the tagline
	  public void printTagline() 
	  {
	   //start switch
	     switch(companyName)
	      {
		   case "APPLE":    System.out.println(companyName+"---Think different."); 
	               break;	   
		   case "ACCENTURE":System.out.println(companyName+"---High Performance. Delivered.");  
		           break;
		   case "ADOBE":    System.out.println(companyName+"---Better by Adobe.");  
		           break;
		   case "AMAZON":   System.out.println(companyName+"---… and You’re Done"); 
	               break;	   
		   case "MICROSOFT":System.out.println(companyName+"---Your potential. Our passion.");  
	  	           break; 
		   default:System.out.println("!!!!Wrong Choice!!!!");  

		  }//end switch


	  }//end method

	 //declaring main
	 public static void main(String args[])
	 {
	  
		//creating object of Scanner
		    Scanner sc=new Scanner(System.in);
			
		   //creating object of class
		    CompanyTaglines ct = new CompanyTaglines();
		    
		    String name;
		   //company name
		    System.out.println("1.Apple");   
		    System.out.println("2.Accenture");   
		    System.out.println("3.Adobe");   
		    System.out.println("4.Amazon");   
		    System.out.println("5.Microsoft");

			//taking choice input	
		    System.out.println("----Enter your choice----"); 
			name=sc.next().toUpperCase();
			
			//calling method to print tagline
			ct.nameCompany(name);
			
			//calling the method printDetails
			System.out.println("---------------------------------");
			ct.printTagline();
			System.out.println("---------------------------------");
			sc.close();
		

	 }//end main

	}//end class