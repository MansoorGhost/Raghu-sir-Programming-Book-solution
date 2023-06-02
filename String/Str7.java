package org.stringjsp;

import java.util.Scanner;

public class Str7 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the sentence");
	    String str=sc.nextLine();
	    char[] ch=str.toCharArray();
	    int vl=0,cn=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	if(ch[i]>='a'&&ch[i]<='z')
	    	{
	    		
	    			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	    			vl++;
	    		else
	    			cn++;
	    	}
	    }
	    System.out.println("count the vowel:- "+vl);
	    System.out.println("count the consonant:- "+cn);

	}

}
