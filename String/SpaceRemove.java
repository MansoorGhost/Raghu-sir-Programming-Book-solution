package org.stringjsp;

import java.util.Scanner;

public class SpaceRemove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the senten");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=' ')
				res=res+ch[i];
			else
				res=res+'*';//continue;
		}
		System.out.println(res);

	}

}
