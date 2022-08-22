package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		
		String s="java";
	      char charArray[] = s.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	}

}
