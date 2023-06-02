package org.stringjsp;

import java.util.Scanner;

public class str6 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int cp=0,sm=0;
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]>='A' &&ch[i]<='Z')
		
		{	
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				cp++;
		}
		else if(ch[i]>='a' &&ch[i]<='z')	{
			
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')

				sm++;
		}
	}
	System.out.println("count the vowels capital letter:- "+cp);
	System.out.println("count the vowels small latter:- "+sm);
}
}
