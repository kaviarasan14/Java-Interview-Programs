package com.sample.org;

public class Prime_Numbers {
	public static void main(String[] args) {
		int n=7;
		//What is prime number
		//divisible only by 1 & the number itself
		//2 is a prime & non-prime
		//1 is not a prime & not non-prime
		
		int count=0;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {      //n/2 gives quotient / n%2 gives remainder
				count++;      // change the flag
			}
		}
		if(count==0) {
			System.out.println(n+"is a prime");
		}
		
		
	}
}
