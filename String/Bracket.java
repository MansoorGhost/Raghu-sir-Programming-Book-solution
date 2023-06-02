package org.stringjsp;

import java.util.Scanner;

public class Bracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the balance");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i='(';i<str.length();i++)
		{
			if(ch[i]=='(')
				{System.out.println("valid"+ch[i]);
				
				}
			else
			{
				System.out.println("invalid"+ch[i]);
			}
		}
	}

}
