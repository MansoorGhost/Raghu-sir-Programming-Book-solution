//chitraduraga is a fort city
//5
package org.stringjsp;
import java.util.Scanner;
public class Str39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		System.out.println(count);

	}

}
