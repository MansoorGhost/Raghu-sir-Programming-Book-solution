package org.stringjsp;

import java.util.Scanner;

public class str2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		int cap=0,sm=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				cap++;
			else if(ch>='a'&&ch<='z')
				sm++;
		}
		System.out.println("count of capatil letter :-"+cap);
		System.out.println("count of capatil letter :- "+sm);
		

	}

}
