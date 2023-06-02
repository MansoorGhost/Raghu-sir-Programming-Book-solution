//CHITRADURGA IS A FORT CITY
//chitradurga is a fort city
package org.stringjsp;

import java.util.Scanner;

public class str34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence small letter");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
			System.out.print(ch[i]);
		}
		

	}

}
