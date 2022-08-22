package com.string;

import java.util.Arrays;

public class SliptString {
	
	public static void spt(String str)
	{
		String[] arr = str.split("[@.]");
		System.out.println(Arrays.toString(arr));
        System.out.println("word length: "+arr.length);
	}
	public static void main(String[] args) {
		
		 String str = "tq@gmail.com";
		 SliptString.spt(str);
	        
	        
	  
	      
		
	}

}
