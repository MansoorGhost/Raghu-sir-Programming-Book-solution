package org.stringjsp;

import java.util.Scanner;

public class Str18 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int cpv=0,cpcont=0,spc=0;
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				
				cpv++;
			else
				cpcont++;
		}
		else 
			spc++;
	}
	System.out.println("count the capitial vowel:- "+cpv);
	System.out.println("count the capitial consonent:- "+cpcont);
	System.out.println("count the spical character:- "+spc);
	
}
}
