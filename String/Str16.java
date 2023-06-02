package org.stringjsp;

import java.util.Scanner;

public class Str16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int cpv=0,sct=0,sp=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					cpv++;
				
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			
				
			
				sct++;
				else
					sp++;
			
			
		}
		System.out.println(cpv);
		System.out.println(sct);
		System.out.println(sp);

	}

}
