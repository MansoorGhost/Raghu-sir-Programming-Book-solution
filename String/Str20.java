package org.stringjsp;

import java.util.Scanner;

public class Str20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int letter=0,digit=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
				letter++;
			else
				digit++;
		}
		System.out.println("count letter:- "+letter);
		System.out.println("count digit:- "+digit);

	}

}
