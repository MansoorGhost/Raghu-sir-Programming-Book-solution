//input:- rama is a good boy
//RAMa Is a GOOd BOy
package org.stringjsp;

import java.util.Scanner;

public class Str30 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentences");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		if(i==ch.length-1 && ch[i]!=' '|| ch[i]!=' ' && ch[i+1]==' ')
			{
			// small character
			if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
				
			}
		//capital charater
		else if(ch[i]>='a'&&ch[i]<='z')
		ch[i]=(char)(ch[i]-32);
		System.out.print(ch[i]);
	}

	}

}
