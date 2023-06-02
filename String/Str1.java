//Write a java program to count how many CAPITAL Letters present in the String//
//I/P- MaNsOoR//
//O/P- 4//
package org.stringjsp;

import java.util.Scanner;

public class Str1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z')
			count++;
	}
	System.out.println("count the capital letters :- "+count);
	}
}
