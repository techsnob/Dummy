package com.techsnob.strings;


/**
 * @author nvadakatta
 * Three ways to reverse a string
 * 1. Iterative
 * 2. Recursive
 * 3. Swap
 * 4. Using language specific inbuilt functions.
 */

public class ReverseAString {

	public static void main(String[] args) {
		String input = "MyJava";
		
		//1. Iterative
		for(int i=input.length() - 1 ; i >=0 ; i--) {
			//System.out.print(input.charAt(i));
		}
		
		System.out.println("--------------------");
		//2. Recursive
		//System.out.println("Recursive:" + reverse(input));
		
		//3. Swap
		//System.out.println(swap(input));
		
		String s="this is java";

		System.out.println(s.length()%2);
		
	}
	
	private static String swap(String input) {
		char[] ca = input.toCharArray();
		int mid = input.length() / 2;
		System.out.println(ca);
		return null;
	}

	public static String reverse(String input) {
		if(input.length() <= 1) {
			return input;
		}
		return reverse(input.substring(1)) + input.charAt(0);
	}
}
