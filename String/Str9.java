package org.stringjsp;

import java.util.Scanner;

public class Str9 {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the sentence");
     String str=sc.nextLine();
     char[] ch=str.toCharArray();
     int sm=0, scn=0;
     for(int i=0;i<str.length();i++)
     {
    	 if(ch[i]>='a'&&ch[i]<='z')
    	 {
    		 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
    			 sm++;
    		 else
    			 scn++;
    	 }
     }
     System.out.println("count the small vowel letter:- "+sm);
     System.out.println("count the small consonant letter:- "+scn);
 }
 
}
