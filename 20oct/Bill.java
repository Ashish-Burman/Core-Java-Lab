 /*
Program: To generate bill and give discount if eligible
@author: Ashish Burman
@Date: 20 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class Bill
{
	static void discount(int q)
	{
		
		//declaring variables
		float amt, total, d = 0.0f;
		
		//calculating total amount
		amt = q*540;
		
		//checking elgibility for discount
		if(amt>2000)
        {
			System.out.println("You are eligible for 10% discount");
			d = amt/10;
			total = amt-d;
        }
		
        else 
            total = amt;
		
        //end of IfElse			 
         
        System.out.println("******************************************************************");	 
        System.out.println("                          Total Bill                              ");	 
        System.out.println("Quantity        Rate        Amount          Discount         Total");	 
        System.out.println(q+"              540        "+amt+"            "+d+"         "+total);	
        System.out.println("******************************************************************");
		System.out.println("                       THANK YOU !! VISIT AGAIN !!!!!!!           ");		
	}
	//end of discount
	
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of quantity
		System.out.println("Enter the number of quantites: ");
		int quantity = sc.nextInt();
		discount(quantity);
			
    }
    // end of main
}
// end of class 