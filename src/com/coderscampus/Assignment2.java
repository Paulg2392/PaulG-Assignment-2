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
				
			}

	}

}
