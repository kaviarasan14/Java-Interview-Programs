package com.sample.org;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		 
		int num=sc.nextInt();  //1234
		 
		//1.Method one using algorithm
		 
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;  //0+1234%10=4 40+3=43 430+2=432 4320+1=4321
			num=num/10;        //1234/10=123 123/10=12 12/10=1 1/10=0
			
		}
		System.out.println("Reverse num is"+ " "+ rev);
	}

}
	