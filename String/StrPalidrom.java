package org.stringjsp;

import java.util.Scanner;

public class StrPalidrom 
{
	public static boolean palindrome(String st)
	{
		char[] ch=st.toCharArray();
		
		int i=0,j=st.length()-1;
		
		while(i<j)
		{
			if(ch[i]!=ch[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		
		boolean result=palindrome(str);
			if(result)
				System.out.println("palindrome");
			else
				System.out.println("Not palindrome");

		
		
	}
}
	

