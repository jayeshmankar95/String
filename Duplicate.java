package com.string;

import java.util.Scanner;

public class Duplicate {
	
	public static void showString(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				count=1;
				if(ch[i]==ch[j])
					{
					count++;
					System.out.println("duplicate are: "+ch[j]);
					break;
					}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String here to check duplicate: ");
		String s=sc.nextLine();
		Duplicate.showString(s);
	}
}
