package com.exercises.array;

import java.util.Scanner;

public class arrayExercises {

	public static void main(String[] args) {
		
		
		/*
		# inject0r
		# Array generator by user input  
		# Exercises for beginners
		*/
		
		Scanner input = new Scanner(System.in);
		int array_number[],BigNumber,array_size;

		System.out.println("How many numbers do you want to add into array? ");
		array_size = input.nextInt();

		while(array_size<=0)
		{
		System.out.println("Enter valid a number!");
		array_size = input.nextInt();
		}
		array_number = new int [array_size];

		for(int i =0; i<array_size;i++){
		System.out.println(i+1 +". enter the number");
		array_number[i] = input.nextInt();
		
		}

		BigNumber = array_number[0];

		for(int i = 0; i<array_size;i++){
		if(BigNumber<array_number[i]) // array_number[1] = 6 BigNumber = 5
		{
		BigNumber = array_number[i];
		
		}
		}
		System.out.println("The big number is = " + BigNumber);
		
		for (int x = 0; x < array_number.length; x++) {

			System.out.println((x + 1) + ".object:" + "value " + array_number[x]);

			}
		

	}

}
