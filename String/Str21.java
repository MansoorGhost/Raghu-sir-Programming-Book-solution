package org.stringjsp;
import java.util.Scanner;
public class Str21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int spc=0,dig=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
				continue;
		else if(ch[i]>='0'&&ch[i]<='9')
				 dig++;
		else
				spc++;
		}
		System.out.println("Special: "+spc);
		System.out.println("Digit: "+dig);
	}
}