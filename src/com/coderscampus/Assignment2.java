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
			int secretnumber = random.nextInt(100) + 1;
			
			System.out.println("Guess a number between 1 and 100");
			System.out.println(secretnumber);
			
			while(attempt < 5) {
				guess = keyboard.nextInt();
				attempt ++;
				
				if (guess == secretnumber) { System.out.println("You Win!");
				break; }
				
				else if (guess < secretnumber) {System.out.println("Please pick a higher number");
				}
				
				else if (guess > secretnumber) {System.out.println("Please pick a lower number");
				}
				
				if (attempt == 5) {System.out.println("You lose. Please try again");
				break; }
				

	        }

}
