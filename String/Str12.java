package org.stringjsp;

import java.util.Scanner;

public class Str12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string ");
		String str=sc.next();
		int count=0,spc=0;
		char[] ch=str.toCharArray();
				for(int i=0;i<str.length();i++)
		{
			
			if(ch[i]>='A'&&ch[i]<='Z'|| ch[i]>='a'&&ch[i]<='z' )
				count++;
			else
				spc++;
		}
		System.out.println(count);
		System.out.println(spc);
	}

}
