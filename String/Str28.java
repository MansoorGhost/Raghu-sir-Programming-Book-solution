package org.stringjsp;
//ram is good boy
import java.util.Scanner;

public class Str28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
				   ch[i]=(char)(ch[i]-32);	
			else if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
				
		}

	}System.out.println(ch);

}
}
