package com.string;

public class Dup 
{
	public static void main(String[] args) 
	{	
	String s = "java";
	  int count = 0;
	  char[] ch = s.toCharArray();
	 
	  for (int i = 0; i < s.length(); i++) 
	  		{
		  	for(int j=i+1; j<s.length(); j++)
		  		{
		  		count=1;;
		  		if(ch[i]==ch[j])
		  			{
		  			System.out.println("duplicate are: "+ch[j]);
		  			count++;
		  			break;
		  			}
		  		}	
	  		}
	}

}
