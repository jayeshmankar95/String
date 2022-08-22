package com.string;

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String []a = new String[4];
		System.out.println("Please enter name here");

//		if(s1.compareTo(s2)==0)
//		{
//			System.out.println("equal");
//		}
//		else if(s1.compareTo(s2)<0)
//		{
//			System.out.println("less than");
//		}
//		else
//		{
//			System.out.println("not equal");
//		}
		int min;
		String temp;
		for(int j=0;j<a.length;j++)
		{  
			min = j;
			for(int k=j+1;k<a.length;k++)
			{
				if(a[k].compareTo(a[min])<0)
				{
					min = k; 
				}
			}
			temp = a[j];
			a[j] = a[min];
			a[min] = temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}	
	}
}
