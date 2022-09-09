package org.login;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	
	// Reverse the String
		
		/*String s = "France";
		System.out.println(s);
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		StringBuilder reverse = s1.reverse();
		System.out.println(reverse);
	}*/
		//Swapping two numbers with third variables
		
	/*int x, y, temp;	
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping" +x+y);
		temp = x;
		x =y;
		y = temp;
		System.out.println("After Swapping" +x+y);
	}*/
		//Swapping two numbers without third variable
		
	/*	int x, y;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter x and y");
		x = s.nextInt();
		y = s.nextInt();
		System.out.println("Before swapping \nx "+x+"\ny "+y);
		x = x+y;
		y=x-y;
		x = x-y;
		System.out.println("After swapping \nx "+x+"\ny "+y);
	}*/
		
		//Reverse the String without using Reverse
		/* String st;
		 Scanner c = new Scanner (System.in);
		 System.out.println("Enter the String");
		 st = c.nextLine();
		String[] s1 = st.split("");
		for (int i=s1.length-1; i>=0; i--) {
			System.out.println(s1[i]+ "");
		}*/
		
		//Given number is prime or not
		int temp, num;
		boolean isPrime = true;
		Scanner a = new Scanner (System.in);
		num = a.nextInt();
		a.close();
		for (int i=2; i<=num/2; i++) {
			temp=num%i;
			if (temp==0) {
				isPrime =false;
				break;
			}
		}
		if (isPrime) 
			System.out.println(num + "number is prime");
			else
				System.out.println(num + "num is not prime");
			
		}
		
		}
		
