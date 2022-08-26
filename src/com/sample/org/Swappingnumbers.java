package com.sample.org;

public class Swappingnumbers {
	
	
	public static void methodone() {
		 int a=5;
		 int b=10;
	
		 System.out.println("Before swapping"+" "+ a + " " + b);
		 int c=a; //c=5
		     a=b; // a=10
		     b=c; // b=5
		 System.out.println("After swapping"+ " "+ a + " "+ b );
		 System.out.println("------------------");
	}	
	
	public static void methodtwo() {
		int a=10;
		int b=5;
		a=a-b; //5-10 = -5
		b=a+b; // -5+10 =5
		a=b-a; // 5-(-5)=10
		System.out.println("after swap"+ " "+ a +" " +b);
		
	}	public static void main(String[] args) {
		
		
		methodone();
		methodtwo();
		
		
	}
	

}
