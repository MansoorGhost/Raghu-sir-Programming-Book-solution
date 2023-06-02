package org.stringjsp;

import java.util.Scanner;

public class Str8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int cc=0,cn=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					cc++;
				else
					cn++;
			}
		}
		System.out.println("count the capital vowel:- "+cc);
		System.out.println("count the consonant:- "+cn);



	}

}
