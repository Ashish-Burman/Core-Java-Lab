/*
 * Program - To print Employee's Details
 * @Author - Ashish Burman
 * @Date - 26 Oct 2022
 */

//declaring packages
package com.ques3.employee;

//declaring class
public class EmployeeDetails
{

	//instance variables
	int eid;
	int salary;
	String name;
	String department;
	
	//method to get the details
	public void getDetails(int id,String n, String d, int sal)
	{
		
		eid = id;
		name = n;
		department = d;
		salary = sal;
		
	}
	//end of method
	
	//method to print details
	public void printDetails()
	{
		
	    System.out.println("Employee Details are:-");
	    System.out.println("Employee's ID: "+eid);
	    System.out.println("Employee's Name: "+name);
	    System.out.println("Employee's department: "+department);
	    System.out.println("Employee's salary: Rs."+salary);
	    
	}
	//end of method
	
}
//end of class