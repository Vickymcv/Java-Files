package org.login;

public class PreservingSpace {
	public static void main(String[] args) {
		String s = "India is my country";
		char[] char1 = s.toCharArray();
		char[] char2 = new char[char1.length];
		for (int i = 0; i < char1.length; i++) {
			if (char1[i] == ' ') {
				char2[i] = ' ';
			}
		}
		int j = char2.length - 1;
		for (int i = 0; i < char1.length; i++) {
			if (char1[i] != ' ') {
				if (char2[j] == ' ') {
					j--;
				}
				char2[j] = char1[i];
				j--;
			}
		}
		System.out.println(String.valueOf(char2));

	}

}
