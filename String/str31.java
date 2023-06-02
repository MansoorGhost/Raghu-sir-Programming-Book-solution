//input:- rama is a good boy
//ramA iS A gooD boY
package org.stringjsp;

import java.util.Scanner;

public class str31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				if(ch[i]>='a'&& ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
					
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
			System.out.print(ch[i]);
		}

	}

}
