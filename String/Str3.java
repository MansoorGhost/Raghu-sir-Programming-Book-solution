package org.stringjsp;

import java.util.Scanner;

public class Str3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		int sm=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				sm++;
		}
         System.out.println("count the small letter:- "+sm);
	}

}
