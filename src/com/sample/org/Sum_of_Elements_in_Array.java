package com.sample.org;

public class Sum_of_Elements_in_Array {
	public static void main(String[] args) {
		
		int a[]= {5,4,3,2,1};
		int sum=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array is :"+sum);
		
		// For each loop
		int sum2=0;
		for(int value:a) {
			sum2=sum2+value;
		}
		System.out.println("sum of array is :"+sum2);
	}
}
