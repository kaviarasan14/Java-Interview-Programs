package com.sample.org;

import java.util.HashSet;

public class Find_Duplicate_in_Array {

	public static void main(String[] args) {
		String arr[]= {"java","selenium","c","ruby","java"};
		boolean flag=false;
	//Approach 1
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length; j++) // Compares first value with another values vice versa
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("Duplicate found: "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duyplicates not found");
		}
  // Approach 2
		
	   String a[]= {"java","selenium","ruby","c","java"};
       HashSet<String> languages= new HashSet();
       
       boolean flag2=false;
       
       for(String l:a)
       {
    	  if(languages.add(l)==false)  // hashset returns false if duplicate element is added
    	  {
    		  System.out.println("Duplicate element found: "+l);
    		  flag2=true;
    	  }
       }
       if(flag==false)
       {
    	   System.out.println("Duplicate notn found");
       }
	}

}
