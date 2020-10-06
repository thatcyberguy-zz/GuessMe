//File Name: GuessMe
//Author: David Pierre

//Guess a Number between 1 and 10

import java.util.Scanner;
import java.util.Random; 

public class GuessMe {
	public static void main(String[] args) {
        // The instance of Random class 
        Random rand = new Random()CloneNotSupportedException
        //My int base variable
        int guessMe = 0;
        // Scanner for the user input
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 10");
        guessMe = guess.nextInt();
        // Random Number between 1 to 10
        int rand_int1 = rand.nextInt(10); 
        //Conditions
    if (rand_int1 == guessMe) {
        	
        	System.out.println("Congrats!" + rand_int1 + "Was the correct answer");
        	
        }
     else {
        	System.out.println("I am sorry! The correct answer was " + rand_int1);
        }
      
  
  
    } 
} 
