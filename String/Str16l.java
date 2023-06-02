package org.stringjsp;

import java.util.Scanner;

public class Str16l {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int cpv=0,smcont=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
		          cpv++;
			}
			else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9')
			
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					continue;
				else
					smcont++;   	
			else
				spc++;
			
		}
		System.out.println("count the capital letter:- "+cpv);
		System.out.println("count the small consonent:- "+smcont);
		System.out.println("count the spical character:- "+spc);

	}

}
