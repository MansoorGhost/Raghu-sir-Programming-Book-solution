//input:-gadag@12345
package org.stringjsp;

import java.util.Scanner;

public class str32 {
	static int sumofdigit(String n)
	{
		int sum=0;
		char[] ch=n.toCharArray();
		for(int i=0;i<n.length();i++)
		{
	
	        if(ch[i]>='0'&&ch[i]<='9')
	        	sum=sum+ch[i]-'0';
		}
		return sum;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the digit and sentence");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
    System.out.println(sumofdigit(str));
}
}
