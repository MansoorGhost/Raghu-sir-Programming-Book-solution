package org.stringjsp;

import java.util.Scanner;

public class Str10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int smv=0 ,cn=0;
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
					cn++;
			}
		}
		System.out.println("count the small vowel:- "+smv);
		System.out.println("count the capital consonant:- "+cn);

	}

}
