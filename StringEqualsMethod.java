package com.string;

public class StringEqualsMethod {
	
	void show()
	{
//		String s1= "java Programming";
//		String s2="java Programming";
		String s1=new String("java");
		String s2=new String("java");
		String s3="javaa is awesome";
		System.out.println("equals method : "+s1.equals(s2));
		System.out.println("amethod "+s1==s2);
		System.out.println(s1.concat(s3));
		
		
	}
	
	
	public static void main(String[] args) {
		StringEqualsMethod s=new StringEqualsMethod();
		s.show();
	}

}
