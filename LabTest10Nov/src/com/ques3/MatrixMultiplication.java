/*
 * Program: To print the rank along with the student's name
 * Author: Ashish Burman
 * Date: 10 Nov 2022
 */

//declaring package
package com.ques3;

//declaring class
public class MatrixMultiplication
{
    //main method
	public static void main(String[] args)
	{  
		//creating two matrices    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};      
		
		//declaring a new matrix
		int c[][]=new int[3][3];  
			    
		//multiplying and printing multiplication of 2 matrices    
		//outer loop
		for(int i=0;i<3;i++)
		{    
			//inner loop
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;      
			    //loop start
				for(int k=0;k<3;k++)      
			    {      
					c[i][j]+=a[i][k]*b[k][j];      
			    }
				//end of k loop  
			System.out.print(c[i][j]+" ");  
			}
			//end of inner loop  
			System.out.println();  
		}
		//end outer loop  
	}
    //end of main
}
//end of class