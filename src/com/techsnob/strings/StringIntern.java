package com.techsnob.strings;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s4 = s1.intern();
		String s5 = s2.intern();

		System.out.println(s1 == s2);
		System.out.println(s2 == s4);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s4 == s5);
	}

}
