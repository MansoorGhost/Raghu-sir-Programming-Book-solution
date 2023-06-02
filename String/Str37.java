//madam
//is a palidrom

package org.stringjsp;
import java.util.Scanner;
public class Str37 {
	static boolean ispalidrom(String str)
	{
		char[] ch=str.toCharArray();
		int i=0,j=str.length()-1;
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
		System.out.println("enter the string");
		String str=sc.nextLine();
		boolean rs=ispalidrom(str);
		if(rs==true)
			System.out.println("is a palidrom");
		else
			System.out.println("is not a palidrom");
			}

}
