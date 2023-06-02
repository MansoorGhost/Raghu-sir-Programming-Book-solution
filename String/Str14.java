package org.stringjsp;

import java.util.Scanner;

public class Str14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int cpl=0,spc=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				cpl++;
			else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9')
				continue;
			else
				spc++;
		}
       System.out.println("count the capital letter:- "+cpl);
       System.out.println("count the spical charater "+spc);
	}

}
