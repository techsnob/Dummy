package com.techsnob.interviews;

public class ArrayTripletsSumOf2ElemToThird {

	public static void main(String[] args) {
		int[] arr = {21, 13, 47, 61, 34, 40, 55, 71, 87};
		
		int[][] result = new int[arr.length][arr.length]; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] + arr[i+1] == arr[j])
					System.out.println(" " + arr[i] + arr[i+1] + arr[j]);
					break;
			}
		}
	}

}
