//chitradurga
//agrudartihc
package org.stringjsp;
import java.util.Scanner;
public class str36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
				System.out.print(ch[i]);
		}

	}

}
