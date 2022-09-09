package org.login;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		// Type 1
	/*	String s = "I learn java";
		String[] split = s.split(" "); //Split the string
		String revString = "";

		for (String w : split) {
			String revWords = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				revWords = revWords + w.charAt(i);
			}
			revString = revString + revWords + " ";
		}
		System.out.println(revString);*/
		
		//Type 2
	/*	String s = "I learn java";
		String[] split = s.split("\\s");
		
		String revword="";
		for (String w:split) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			revword=revword+sb.toString()+" ";
		}
		System.out.println(revword);*/
		for(int i=0; i<=5; i++) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int numValue = num;
		int temp;
		int sum=0;
		while (num>0)
		{
			temp=num%10;
			sum=sum+(temp*temp*temp);
			num=num/10;
		}
		if(numValue==sum) {
			System.out.println("It is an Amstrong number");
		} else {
			System.out.println("It is not an amstrong number");
		}
		}
	}

}
