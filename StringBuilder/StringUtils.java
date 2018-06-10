package com.stringbuilder;

public class StringUtils {
	
		/*
		# inject0r
		# String Builder
		# Exercises for beginners
		*/
	
public void StringGenerator() {
	
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("Hello ");
	stringBuilder.append("World \n");
	stringBuilder.append("I am Root ");
	
	String result = stringBuilder.toString();
	
	System.out.println(result.length() + "\n" + result.charAt(3) + "\n" + result + "\n" + result.toUpperCase());
}

}