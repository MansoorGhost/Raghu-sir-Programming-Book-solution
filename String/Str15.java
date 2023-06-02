package org.stringjsp;

import java.util.Scanner;

public class Str15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int cpl=0,sml=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				cpl++;
			else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9')
				sml++;
			else
				spc++;
		}
		System.out.println("count captital letter:- "+cpl);
System.out.println("count small letter:- "+sml);
System.out.println("count spical charcter"+spc);
	}

}
