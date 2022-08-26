package com.sample.org;

public class ReverseString {
	public static void main(String[] args) {
		
	String str="ABCDE";
	String rev="";
    
	int length=str.length(); //5
	
	for ( int i=length-1;i>=0;i--) //5 
	{
	   rev=rev+str.charAt(i);    // 4 3 2 1 0 -1
	}
       System.out.println("reversed string"+rev);	// y a n d y 

       // 2.Method two using StringBuffer
       
       StringBuffer place =new StringBuffer("chennai");
       System.out.println("Reversed string 2"+ " "+place.reverse());
       
}
}