/*
 * Program: To print the dashes for a given word
 * Author: Ashish Burman
 * Date: 17 Nov 2022
 */

//declaring packages
package com.ques1;

//importing packages
import java.util.Scanner;

//declaring class
public class HangmanGame
{
	//method to play game
	void game()
	{
		//declaring variables
		int choice, length;
		char letter;
		String word;
		
		//creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("!! Welcome To HANGMAN GAME !!");
		//list of words
		String[] wordlist = {"Apple","Potato","Truck","Computer","Football"};
		//asking user's choice
		System.out.println("Enter a number between 1 to 5:");
		choice = sc.nextInt();
		//taking out the length of the word
		length = wordlist[choice-1].length();
		//asking for the alphabet
		System.out.println("Enter the alphabet:");
		letter = sc.next().charAt(0);
		
		//printing the blanks
		System.out.println("*** Guess the word ***");
		//loop start
		for(int i=0; i<length; i++)
		{
			if(letter == wordlist[choice-1].charAt(i))
				System.out.print(letter + " ");
			else
				System.out.print("_ ");
		}
		//end of loop
		//To change the cursor line
		System.out.println();
		//To store the answer
		word = sc.next();
		//To print the result
		if(word.equalsIgnoreCase(wordlist[choice-1]) == true)
			System.out.println("!! Congratulations !! Word matched.");
		else
			System.out.println("!! Sorry !! Word mismatched.");
		sc.close();
	}
	//end of method
		
	//main method
	public static void main(String[] args)
	{
		//creating object for class
		HangmanGame hm = new HangmanGame();
		//calling the method
		hm.game();
	}
    //end of main
}
//end of class