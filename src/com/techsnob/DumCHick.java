package com.techsnob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

interface A {
	void X();
}
class B implements A {
	public void X() {
		System.out.println("inside B");
	}
	public void y() {
	}
}
class C extends B {
	public void X() {
		System.out.println("Inside B");
	}
}

class Parent {
	private void display() {
		System.out.println("");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("in child");
	}
}

public class DumCHick {
	public static void main(String[] args) {
		/*
		 * int N = 734; int input = N; int noOfNumbers = 0; int total = 0; while (N > 0)
		 * { total = total + N%10; N = N / 10; noOfNumbers++; } int result = 0; for(int
		 * i = input+1; i <= 50000; i++) { int t = i; int tt = 0; while(t > 0) { tt = tt
		 * + t%10; t = t / 10; } if(total == tt) { result = i; break; } }
		 * System.out.println(noOfNumbers); System.out.println(total);
		 * System.out.println(result);
		 */
		/*
		 * int[] A = { 51, 71, 17, 42 }; int first = 0; int second = 0; int highest = 0;
		 * for (int i = 0; i < A.length; i++) { int firstTotal =
		 * getSumOfTwoDigits(A[i]); for (int j = 0; j < A.length; j++) { int nextTotal =
		 * getSumOfTwoDigits(A[j]); if(firstTotal == nextTotal) { if(highest < A[i] +
		 * A[j]) { highest = A[i] + A[j]; } } } } for (int i = 0; i < A.length; i++) {
		 * int temp = A[i]; int firstTotal = getSumOfTwoDigits(temp); for (int j = i +
		 * 1; j < A.length; j++) { int nextTotal = getSumOfTwoDigits(A[j]); if
		 * (firstTotal == nextTotal) { first = temp; second = A[j]; highest = firstTotal
		 * + nextTotal; break; } } } System.out.println(first);
		 * System.out.println(second); System.out.println(highest); }
		 * 
		 * static int getSumOfTwoDigits(int v) { int tot = 0; while (v > 0) { tot = tot
		 * + v % 10; v = v / 10; } return tot;
		 */
		/*
		 * char[] splChars = { '&', '-' }; List<String> wordsArr =
		 * Arrays.asList("vi-tech", "systems", "group&", ";Inc"); String result =
		 * wordsArr.stream().collect(Collectors.joining()); for (int i = 0; i <
		 * splChars.length; i++) { result =
		 * result.replaceAll(String.valueOf(splChars[i]), ""); }
		 * System.out.println(result);
		 */
		/*
		 * Map<String, String> names = new HashMap<>(); names.put(null, null);
		 * names.put(null, "naresh"); names.put("naresh","naresh"); names.put("naresh",
		 * null); names.put("5","7"); //System.out.println(names); names.forEach((k , v)
		 * -> System.out.println(k + " " + v)); names.entrySet().forEach(e ->
		 * System.out.println(e.getKey() + "" + e.getValue())); for(Entry<String,
		 * String> e:names.entrySet()) { System.out.println(e.getKey() + " " +
		 * e.getValue()); }
		 */
		/*
		 * List<A> aa = new ArrayList<>(); aa.add(new B()); aa.add(new C()); for (A a :
		 * aa) { a.X(); }
		 */
//		int k=0;
//		for (int i = 1; i < 6; i++) {
//			for (int j = i; j < i+1; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		String input = "nldzj";
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length(); i++) {
			sb.append(String.valueOf((input.charAt(i)) + 3));
		}
		System.out.println(sb.toString());
	}
}
