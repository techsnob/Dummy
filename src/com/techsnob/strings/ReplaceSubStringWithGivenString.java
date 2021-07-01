package com.techsnob.strings;

public class ReplaceSubStringWithGivenString {

	public static void main(String[] args) {
		String givenWord = "this";
		String s1 = "In this something need to replaced, if this is that keyword, this would be better";
		String result = "";
		String replaceWord = "that";
		String[] splitWords = s1.split(" ");
		for (int i = 0; i < splitWords.length; i++) {
			if(i != 0) {
				result = result + " ";
			}
			if (givenWord.equals(splitWords[i])) {
				result = result + replaceWord;
			} else {
				result = result + splitWords[i];
			}
		}
		System.out.println(result);
	}

}
