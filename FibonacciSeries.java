package org.login;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a1=0;
		int a2=1;
		System.out.println(a1);
		System.out.println(a2);
		for (int i=0; i<=15;i++) {
			int sum = a1 + a2;
			System.out.println(sum);
			a1=a2;
			a2=sum;
		}
	}
	

}
