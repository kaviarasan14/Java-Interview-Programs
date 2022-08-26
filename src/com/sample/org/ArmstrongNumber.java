package com.sample.org;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number=1634, originalnumber, remainder;
		double result=0;
		
		originalnumber=number; //1634
		
		while(originalnumber!=0) 
		{
			remainder = originalnumber%10; // 4
			result = result+Math.pow(remainder, 4);
			originalnumber = originalnumber/10;
		}
		if(result == number) 
		{
			System.out.println(number+"is a armstrong number");
		}
		else
		{
			System.out.println(number+"is not aarmstrong number");
		}
		
		
	}

}
