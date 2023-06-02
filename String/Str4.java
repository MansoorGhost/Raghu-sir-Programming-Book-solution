package org.stringjsp;

import java.util.Scanner;

public class Str4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				count++;
		}
			}System.out.println("Count the vowel Capatil letter:- "+count);

	}

}
