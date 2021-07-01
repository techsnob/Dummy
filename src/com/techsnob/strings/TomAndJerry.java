package com.techsnob.strings;

import java.util.Iterator;
import java.util.Scanner;

public class TomAndJerry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine().trim());
		String inputs[] = new String[t];
		String matches[] = new String[t];
		for (int n = 0; n < t; n++) {
			if (sc.hasNext()) {
				inputs[n] = sc.nextLine().trim();
				matches[n] = sc.nextLine().trim();
			}
		}

		for (int n = 0; n < t; n++) {
			if (matches[n] != null) {
				for (int i = 0; i < matches[n].length(); i++) {
					for (int j = 0; j < inputs[n].length(); j++) {
						char k = matches[n].charAt(i);
						if(k == inputs[j].charAt(i)) {
							
						}
					}
				}
			}
		}

	}

}
