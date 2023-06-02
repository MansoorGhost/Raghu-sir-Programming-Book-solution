package org.stringjsp;

import java.util.Scanner;

public class Str19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int cpv=0,cpcont=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					cpv++;
				else 
					cpcont++;
			}
				else if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='0'&&ch[i]<='9')
				continue;
			else 
				spc++;
		}
		System.out.println("count the small vowel:- "+cpv);
		System.out.println("count the small consonent:- "+cpcont);
		System.out.println("count the spical character:- "+spc);
		
	}

	}

