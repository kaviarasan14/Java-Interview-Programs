package com.sample.org;

public class Primenumbers_btw_1to100 {
	public static void main(String[] args) {
		int n;
		int prime=0;
		for (n=2; n<=100; n++) {
			int count=0;
			
			for(int i=2; i<n; i++) {
				if(n % i==0) {
					count++;
				}
			}
		
		if(count==0) {
			System.out.println(n+"PRIME NUMBER");
			prime++;  //for total num of prime number
		}
		else {
			System.out.println(n+"Not a prime");
		}
		
	}
		//Total num of prime num
		// Declare a integer prime
		System.out.println("Total num of prime num"+prime);

	}
}