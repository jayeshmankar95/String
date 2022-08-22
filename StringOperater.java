package com.string;

public class StringOperater {
	public static void main(String[] args) {
		String s1="Pune";
		String s2=new String("pune");
		String s3="Pune";
		String s4="mumbai";
		
		System.out.println(s1==s2.intern());
		System.out.println(s1==s3.intern());
		System.out.println(s1==s3);
		
		StringBuffer sb1=new StringBuffer("hello");

		StringBuffer sb2=new StringBuffer("hello");
//		System.out.println(sb.capacity());
//		sb.append("hello");
//		System.out.println(sb.capacity());
//		System.out.println(sb.reverse());
		System.out.println("-------------");
		//System.out.println(sb1.equals(sb2));
		//System.out.println(sb1.compareTo(sb2));
		System.out.println(s1.compareTo(s3));
		
		
	}
}
