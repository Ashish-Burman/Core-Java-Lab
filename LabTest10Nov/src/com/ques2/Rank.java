/*
 * Program: To print the rank along with the student's name
 * Author: Ashish Burman
 * Date: 10 Nov 2022
 */

//declaring package
package com.ques2;

//importing packages
import java.util.Scanner;

//declaring class
public class Rank
{
    //main method
	public static void main(String[] args)
	{
		//declaring the arrays 
		String name[] = new String[20];
		double marks[] = new double[20];
		int rank[] = new int[20];
		int temp = 0;
		
		//creating object for Scanner
		Scanner sc = new Scanner(System.in);
				
		//taking input of name and marks
		System.out.println("To enter 10 names of students and their marks:");
		//loop start
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter the name of student and his marks:");
			name[i] = sc.next();
			marks[i] = sc.nextDouble();
		}
		//end of loop
		
		//comparing marks
		//outer loop
		for(int i=0; i<10; i++)
		{
			rank[i] = i+1;
			//inner loop
			for(int j=0; j<10; j++)
			{
				//condition
				if(marks[i]<marks[j])
				{
					//swapping
					temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}
				//end of if
			}
			//end of inner loop
		}
		//end of outer loop
		
		//printing the output
		System.out.println("Student's names according to their rank are:");
		
		//loop start
		for(int i=0; i<10; i++)
		{
			System.out.println(name[i]+" "+marks[i]+" "+rank[i]);
		}
		//end of loop
		
		sc.close();
	}
    //end of main
}
//end of class