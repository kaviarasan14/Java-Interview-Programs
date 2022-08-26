package com.sample.org;

import java.util.Arrays;
import java.util.Collections;

public class Bublesort_SortingofArray {
	
	public static void main(String[] args) {
		
		/*int a[]= {4, 3 ,1, 2, 5};
		
		System.out.println("Before sorting of array"+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0; i<n-1; i++) {  // Number of passses (number of arrays)
			
			for(int j=0; j<n-1; j++) { //Iteration in each
				
				if (a[j]>a[j+1]) { // for descending order a[j]<a[j+1]
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		 System.out.println("After Sorting"+Arrays.toString(a));*/	
		 
		// Sorting using Built-In function
		// 1) approach 1
		
	/*	int a[]= {30,50,20,10,40};
		System.out.println("Before sort:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sort:"+Arrays.toString(a)); */
		
		// Approach 2
	/*	int a[]= {30,50,20,10,40};
		System.out.println("Before sort:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sort:"+Arrays.toString(a));	*/
		
		// Reverse Descending order
		Integer d[]= {30,50,20,10,40};
		System.out.println("Before sort:"+Arrays.toString(d));
		Arrays.sort(d,Collections.reverseOrder());
		System.out.println("After sort:"+Arrays.toString(d));
		
		
	}	
}

 















