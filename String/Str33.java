//ram is good boy
//RAM IS GOOD BOY
package org.stringjsp;

import java.util.Scanner;

public class Str33 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the sentence");
	 String str=sc.nextLine();
	 char[] ch=str.toCharArray();
	 for(int i=0;i<str.length();i++)
	 {
		 
			 if(ch[i]>='a'&&ch[i]<='z')
				 ch[i]=(char)(ch[i]-32);
			 System.out.print(ch[i]);
		 
	 }
	}

}
