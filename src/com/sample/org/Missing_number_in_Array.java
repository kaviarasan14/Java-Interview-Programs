package com.sample.org;

public class Missing_number_in_Array {
	public static void main(String[] args) {
		/* Array should not have duplicate
		 Array no need to be in sorted order
		 values should be in range
	    -------> Logic
     1+2+4+5=12 sum1
	 1+2+3+4+5=15 sum2
	 sum2-sum1=3 */
     	int a[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<a.length;i++) 
		{
		  sum1=sum1+a[i];	
		}
		System.out.println(sum1);
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("Missing num is: "+(sum2-sum1));
	}

}
