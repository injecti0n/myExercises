package beginner;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

	/*
	# inject0r
	# Guess Number Project  
	# Exercises for beginners
	*/
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) + 1;
        int guess;
        
        do
        {
            System.out.print("Enter a number [1,10]: ");
            guess = scan.nextInt();
            if (guess < number) System.out.println("Higher");
            if (guess > number) System.out.println("Lower");
        }
        while (guess != number);
        
        System.out.println("You guessed. Congratulations!");
        
				}

	}
