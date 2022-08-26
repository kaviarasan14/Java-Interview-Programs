package com.sample.org;

public class Print_Even_and_Odd_num_in_array {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5};
	System.out.println("Even numbers in array :");
	for(int i=0; i<a.length;i++)
	{
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
	}
	// using for each for odd number / above normal for loop aslo can be used
	System.out.println("Odd num in array :");
	for(int value:a)
	{
		if(value%2!=0) {
			System.out.println(value);
		}
	}
	
}
}
