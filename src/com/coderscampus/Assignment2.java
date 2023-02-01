package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		// random num generator
		
		// collect user input
		
		// variables		
			int guess = -1;
			int attempt = 0;
		
		// inputs
			Scanner keyboard = new Scanner(System.in);
			Random random = new Random();
			int secretNumber = random.nextInt(100) + 1;
			
			System.out.println("Guess a number between 1 and 100");
			//System.out.println(secretNumber);
			
			while(attempt < 5) {
				guess = keyboard.nextInt();
				
				if (guess <= 100 && guess >= 1) {
				
					if (guess == secretNumber) { System.out.println("You Win!");
					break; }
				
					else if (guess < secretNumber) {System.out.println("Please pick a higher number");
					}
				
					else if (guess > secretNumber) {System.out.println("Please pick a lower number");
					}
				attempt++;}
				else {System.out.println("Not a valid choice");
				}
				
				if (attempt == 5) {System.out.println("You lose. The number to guess was " + secretNumber );
				}

	        }
			keyboard.close();

}
}