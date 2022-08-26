package com.sample.org;

import java.util.Scanner;

public class Count_of_words {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Word");
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int count=1;
		
		for (int i=0; i<s.length()-1; i++) {
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ') ) { // Checks if space and not space after blank space
				
				count++;
			}
		}
		System.out.println("Number of words:"+count);
	}
		
} 
