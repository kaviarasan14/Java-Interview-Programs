package com.sample.org;

public class Remove_special_from_String {
	
	public static void main(String[]args) {
		String s="@#$!@#%!#$@$(*&*& }{:{}>{Java is a programing lanag*&&uage";
		String s2 = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s2);
		
	}

}
