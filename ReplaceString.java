package com.string;

public class ReplaceString {
	public static void checkPassword(String s)
	{
		boolean res=s.matches(s);
				if(res==true)
					System.out.println("valid password");
				else
					System.out.println("invalid.. try again");
	}
	public static void main(String[] args) {
		String s="Java is awesome";
		System.out.println(s);
		
		String ss=s.replaceAll("[jJ][a-zA-z]", "aa");
		System.out.println(ss);
		
		ReplaceString.checkPassword(ss);
		
	
		
		
	}

}
