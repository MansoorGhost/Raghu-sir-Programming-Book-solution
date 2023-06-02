//LISTEN
//SILENT
package org.stringjsp;
import java.util.Scanner;

public class Str40 {
static int[] countfreq(String str)
{
	char[] ch=str.toCharArray();
	int[] count=new int[26];
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
			count[ch[i]-65]++;
	}
	return count;
}
static boolean isanagram(String str1,String str2)
{
	int[] c1=countfreq(str1);
	int[] c2=countfreq(str2);
	for(int i=0;i<26;i++)
	{
		if(c1[i]!=c2[i])
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String str1=sc.nextLine();
		boolean rc=isanagram(str,str1);
		if(rc==true)
			System.out.println("is a anagram");
		else
			System.out.println("is a not anagram");
		

	}

}
