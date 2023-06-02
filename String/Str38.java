//ramesh is a good boy
//hamesr si a doog yob

package org.stringjsp;
import java.util.Scanner;
public class Str38 {
	static String getSwapFirstToLastChar(String str)
	{
		char[] ch=str.toCharArray();
		int f=0;
		for(int i=0;i<str.length();i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&& ch[i+1]==' ')
			{
			   char t=ch[f];
			   ch[f]=ch[i];
			   ch[i]=t;
			}
			
		}
		str=new String (ch);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String rc=getSwapFirstToLastChar(str);
		System.out.println(rc);	
	}
}
