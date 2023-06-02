package org.stringjsp;

import java.util.Scanner;

public class Str5 {
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the sentence");
	  String str=sc.nextLine();
	  char[] ch=str.toCharArray();
	  int small=0;
	  for(int i=0;i<str.length();i++)
	  {
		  if(ch[i]>='a'&&ch[i]<='z')
		  {
			  if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				  small++;
		  }
	  }
	  System.out.println("count the vowels small lettter:- "+small);
  }
}
