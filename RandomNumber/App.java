package com.random.exercise;

import java.util.Scanner;

public class App {
	
		/*
		# inject0r
		# RandomNumber
		# Exercises for beginners
		*/

	public static void main(String[] args) {
		RandomUtils RandomInteger= new RandomUtils();
		Scanner input = new Scanner(System.in);
		System.out.println("First integer: ");
		int a = input.nextInt();
		System.out.println("Second Integer: ");
		int b = input.nextInt();
		RandomInteger.RandomGenerator(a, b);

	}

	

	

}
