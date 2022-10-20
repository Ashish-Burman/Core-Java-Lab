 /*
Program: To perform certain operations according to user's choice
@author: Ashish Burman
@Date: 20 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class Operations
{
	//defining a method for square of number
	static void square(int n)     //formal parameter
	{
	 
        System.out.println("Square of the given number is: "+(n*n));      //printing the result	

	}
	
	//defining a method for cube of number
	static void cube(int n)     //formal parameter
	{
	 
        System.out.println("Cube of the given number is: "+(n*n*n));      //printing the result	

	}

	//defining a method to find even or odd
	static void even_odd(int n)     //formal parameter
	{
	  //printing the result	
        if((n%2)==0)
			System.out.println("The given number is Even");  
        else
		System.out.println("The given number is Odd");	
	}
	
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
        
		//declaring variables
		int choice, number;
		
		// menu for operations
		System.out.println("Press 1 for Square of the number");
		System.out.println("Press 2 for Cube of the number");
		System.out.println("Press 3 to find Even or Odd");
		System.out.println("Press 4 to Exit");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		//asking number
		System.out.println("Enter a number:");
		number = sc.nextInt();
		
		//calling method using switch 
		 //switch case
	   switch(choice)
	   {
		   case 1:square(number);
		          break;
		   case 2:cube(number);
		          break;
		   case 3:even_odd(number);
		          break;
		   case 4:System.exit(0);
		          break;
		  default: System.out.println("Wrong input provided");

	   }
	// end of switchcase
		
    }
    // end of main
}
// end of class 