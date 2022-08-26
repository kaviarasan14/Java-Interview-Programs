package com.sample.org;

public class Number_of_Odd_Even_num {
public static void main(String[] args) {
	int num= 1234;
	int even=0;
	int odd=0;
	
	while(num>0) { //1234 123 12 1
		
		int rem=num%10;  //gives last num  4 3 2 1
		if(rem%2==0)   
		{
			even++;    // 1 2
		}
		else
		{
		    odd++;   //1 2
		}
		num=num/10; // leaves last digit 123  12 1 0
	}
      System.out.println("Even num: "+even);
      System.out.println("Odd num: "+odd);
}
}
