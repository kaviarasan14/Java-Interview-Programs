package com.sample.org;

public class Find_Largest_Smallest_num_in_array {
	
	public static void main(String[] args) {
		int a[]= {20,40,50,30,60};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Num is :"+max);
		
		// for minimum
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum num is: "+min);
	}

}
