package org.stringjsp;

import java.util.Scanner;
//davanagere
public class Str26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
			 if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')	
				ch[i]=(char)(ch[i]+32);
			 
			}
			 else if(ch[i]>='a'&&ch[i]<='z')
			 {
				 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					 continue;
				 else
				 ch[i]=(char)(ch[i]-32);
			 
		}
			
        
	}System.out.println(ch);
	}
}
