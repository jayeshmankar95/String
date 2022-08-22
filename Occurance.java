package com.string;

public class Occurance {
	public void occ(String s)
	{
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='@')
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='@';
				}
			}

			System.out.println(a[i]+" occure "+count+" times");
		}
	}
	public static void main(String[] args) {
		Occurance o=new Occurance();
		String s="pankaj mankar";
		o.occ(s);
		
	}

}
