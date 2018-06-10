package com.random.exercise;

import java.util.Random;

public class RandomUtils {
	
	
		/*
		# inject0r
		# RandomNumber  
		# Exercises for beginners
		*/

	public void RandomGenerator(int a, int b)
	{
		Random generator = new Random();
		for(int i =0; i<100; i++) {
		int input = generator.nextInt(a)-b;
		
			System.out.println(input);
		}

	}

}
