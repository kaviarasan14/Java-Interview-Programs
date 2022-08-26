package com.sample.org;

public class Num_of_character_occurences {
	public static void main(String[] args) {
		String s ="java programming java program";
		
	    int total_count = s.length(); // total count of a string
		int after_count=s.replace("a", "").length(); // count after removing the character
		int count= total_count-after_count;
		
		System.out.println("Number of occurences of a is :"+count);
	}

}
