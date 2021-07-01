package com.techsnob.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Literals {
	
	public static void change(int x) {
		x = 0;
	}

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);//True 
		int x = 4;
		change(x);
		System.out.println(x);
		//System.out.println(Arrays.stream(x).boxed().collect(Collectors.toList()));
	}

}
