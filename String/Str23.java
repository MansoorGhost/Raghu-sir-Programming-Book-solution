package org.stringjsp;

import java.util.Scanner;

public class Str23 {
	//input:-g2a^jen5d%ra8g#ad6a@

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int sml=0,spc=0,dig=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
				sml++;
			else if(ch[i]>='0'&&ch[i]<='9')
				dig++;
				
			else if(ch[i]>='A'&&ch[i]<='Z')
				continue;
			else
				spc++;
		}
		System.out.println("count are small letter:- "+sml);
		System.out.println("count are special character:- "+spc);
		System.out.println("count are digits:- "+dig);

	}

}
