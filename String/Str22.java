package org.stringjsp;

import java.util.Scanner;

public class Str22 {
	// input:-B3A@N6G$A7LO%R9E

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int cpl=0,spc=0,dig=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				cpl++;
			else if(ch[i]>='0'&&ch[i]<='9')
				dig++;
			else if(ch[i]>='a'&&ch[i]<='z')
				continue;
			else
				spc++;
		}
		System.out.println("count are capital letter"+cpl);
		System.out.println("count are special characters"+spc);
		System.out.println("count are digit:-"+dig);
	}

}
