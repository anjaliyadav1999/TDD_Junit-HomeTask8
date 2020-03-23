package com.tdd_junit;

public class removing_A {
	String res;
	int len;
	public String remove(String s)
	{
		len=s.length();
		if(len>2)
		{
			if(s.charAt(0)=='A'&&s.charAt(1)=='A')
			{
				res=s.substring(2);
			}
			else if(s.charAt(0)=='A'&&s.charAt(1)!='A')
			{
				res=s.substring(1);
			}
			else if(s.charAt(0)!='A'&& s.charAt(1)=='A')
			{
				res=s.charAt(0)+s.substring(2);
			}
			else if(s.charAt(0)!='A'&& s.charAt(1)!='A')
			{
				res=s;
			}
		}
		else
		{
			if(s.charAt(0)=='A'&&s.charAt(1)=='A')
			{
				res="";
			}
			else if(s.charAt(0)=='A'&&s.charAt(1)!='A')
			{
				res=""+ s.charAt(1);
			}
			else if(s.charAt(0)!='A'&& s.charAt(1)=='A')
			{
				res=""+ s.charAt(0);
			}
			else if(s.charAt(0)!='A'&& s.charAt(1)!='A')
			{
				res=s;
			}
		}
	return res;
	}
}
