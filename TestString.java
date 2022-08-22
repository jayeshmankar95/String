package com.string;

import java.util.Scanner;

public class TestString {
	
	
	void checkString(String s1, String s2)
	{
		boolean flag=true;
		int count=0;

		for(int i=0;i<s2.length();i++)
			{
				for(int j=0;j<s1.length();j++)
				{
					if(s2.charAt(i)==s1.charAt(j))
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					flag=false;
					break;	
				}
		}
		if(flag==true)
		{
			System.out.println("it's possible");
		}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd String: ");
		String s2=sc.nextLine();
		TestString ts=new TestString();
		ts.checkString(s1, s2);	
	}
}
