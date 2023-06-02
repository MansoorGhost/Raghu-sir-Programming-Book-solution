//rama is a good boy
//boy good a is rama
package org.stringjsp;

import java.util.Scanner;

public class Str41 {
	static String isreverse(String str)
	{
		char[] ch=str.toCharArray();
		String rs="";
		for(int i=ch.length-1;i>0;i--)
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				rs=rs+ch[j];
				j++;
			}
			if(i>=0)
				rs=rs+ch[i];
			
	}
		return rs;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		String rc=isreverse(str);
		System.out.println(rc);
		
	}
}
