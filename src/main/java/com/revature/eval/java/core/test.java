package com.revature.eval.java.core;


public class test {
	public static void main(String[] args) {

		String threeWords = "Portable Network Graphics";
		String[] word = threeWords.split(" ");
		
		String acronym =
			Character.toString(word[0].charAt(0)).toUpperCase() + 
			Character.toString(word[1].charAt(0)).toUpperCase() + 
			Character.toString(word[2].charAt(0)).toUpperCase() +
			Character.toString(word[3].charAt(0)).toUpperCase();
		System.out.println("Acronym is: "+ acronym);
		
	return;
	}
}
