/*
 * Program - To print Employee's Details
 * @Author - Ashish Burman
 * @Date - 26 Oct 2022
 */

//declaring packages
package com.ques3.employee.test;

import java.util.Scanner;

//importing Student packages
import com.ques3.employee.EmployeeDetails;

//declaring class
public class EmployeeTest
{

	//main method
	public static void main(String args[])
	{
		
		//creating object of Student class
		EmployeeDetails ed1 = new EmployeeDetails();
		EmployeeDetails ed2 = new EmployeeDetails();
		
		//declaring an object of Scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int id, salary;
		String name, department;
		
		//taking input
		System.out.println("Enter the Employee ID:");
		id = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		name = sc.next();
		System.out.println("Enter the Employee Department:");
		department = sc.next();
		System.out.println("Enter the Employee salary:");
		salary = sc.nextInt();
		
		//calling the method getDetails for first employee
		ed1.getDetails(id, name, department, salary);
		
		//calling the method printDetails for first employee
		System.out.println("Details of First Employee");
		System.out.println("---------------------------------");
		ed1.printDetails();
		System.out.println("---------------------------------");
		
		//calling the method getDetails for second employee
		ed2.getDetails(id, name, department, salary);
				
     	//calling the method printDetails for sencond employee
		System.out.println("Details of Second Employee");
		System.out.println("---------------------------------");
		ed2.printDetails();
		System.out.println("---------------------------------");
				
		sc.close();
		
	}
	//end of main
	
}
//end of class