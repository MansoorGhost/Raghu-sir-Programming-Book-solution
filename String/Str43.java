package org.stringjsp;

import java.util.Scanner;

public class Str43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentces");
		String str=sc.nextLine();
		String rs="";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<=ch.length;i++)
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
		   i++;
			}
		
		int j=i-1;
		while(j>=k) 
		{
			rs=rs+ch[j];
			j--;
		}
		if(i<ch.length)
			rs=rs+ch[i];
			

	}
       System.out.println(rs);

}
}