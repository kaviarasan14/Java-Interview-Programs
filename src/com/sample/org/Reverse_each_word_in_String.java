package com.sample.org;

import java.util.Arrays;

public class Reverse_each_word_in_String {

	public static void main(String[] args) {
		
		String str="Welcome to java programming";
		
		String []words=str.split(" "); //Splitting String in to words and stored as array
		
		String reversestring="";
		
		for(String w:words)
		{
			String reverseword="";
			
          for(int i=w.length()-1; i>=0; i--) {
        	  reverseword=reverseword+w.charAt(i);
          }
          reversestring=reversestring+reverseword+" ";
		}
		System.out.println("Reversed string: "+reversestring);
	}

}
