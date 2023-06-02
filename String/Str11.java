package org.stringjsp;

import java.util.Scanner;

public class Str11 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int cpv=0,smcont=0;
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
		     cpv++;
		}
		else if(ch[i]>='a'&&ch[i]<='z')
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		
			continue;
		else
			smcont++;
		}
	}System.out.println("count the Capital vowel "+cpv);
	System.out.println("count the small consonent "+smcont);

	}

}
