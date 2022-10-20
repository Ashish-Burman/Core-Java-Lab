 /*
Program: To check oldest and youngest people among three
@author: Ashish Burman
@Date: 20 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class CompareAge
{
	static void oldest(int a1, int a2, int a3)      //formal parameter
	{
	//comparing the oldest age
		if((a1>a2)&&(a1>a3))
			System.out.println("First person is oldest with age: "+a1);
        else if(a2>a3)
			System.out.println("Second person is oldest with age: "+a2);
		else
		   System.out.println("Third person is oldest with age: "+a3);	
        //end of IfElse Ladder	
	}
	
	static void youngest(int a1, int a2, int a3)      //formal parameter
	{
	//comparing the youngest age
		if((a1<a2)&&(a1<a3))
			System.out.println("First person is youngest with age: "+a1);
        else if(a2<a3)
			System.out.println("Second person is youngest with age: "+a2);
		else
		   System.out.println("Third person is youngest with age: "+a3);	
        //end of IfElse Ladder	
	}
	
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of ages
		System.out.println("Enter the age of first person:");
		int age1 = sc.nextInt();
		System.out.println("Enter the age of second person:");
		int age2 = sc.nextInt();
		System.out.println("Enter the age of third person:");
		int age3 = sc.nextInt();
		
		//calling method to check the oldest age
		oldest(age1,age2,age3);
		
		//calling method to check the youngest age
		youngest(age1,age2,age3);
			
    }
    // end of main
}
// end of class 