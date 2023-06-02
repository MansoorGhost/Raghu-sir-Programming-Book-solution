package org.stringjsp;

import java.util.Scanner;

public class Str13 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int sml=0,spc=0;
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]>='a'&&ch[i]<='z')
			sml++;
		else if (ch[i]>='A'&&ch[i]<='Z'||ch[i]>='0'&&ch[i]<='9')
			continue;
		else
			spc++;
	}
	System.out.println("count the small letter:- "+sml);
	System.out.println("count the specail character:- "+spc);
}
}
