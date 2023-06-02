package org.stringjsp;

import java.util.Scanner;

public class Str17 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int smv=0,cpcont=0,spc=0;
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]>='a'&&ch[i]<='z')
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				smv++;
		}
		else if(ch[i]>='A'&&ch[i]<='Z')
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				continue;
			else
				cpcont++;
		}
		else
			spc++;
	}
	System.out.println("count small vowel:- "+smv);
	System.out.println("count capital consonent:- "+cpcont);
	System.out.println("count spical character:- "+spc);

	}

}
