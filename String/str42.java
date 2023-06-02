
//rama is a good boy
//rama->4
//is->2
//a->1
//good->4
//boy->3
package org.stringjsp;
import java.util.Scanner;
public class str42 {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the sentence");
	 String str=sc.nextLine();
	 char[] ch=str.toCharArray();
	 for(int i=0;i<=ch.length;i++)
	 {
		 String word="";
		 while(i<=ch.length-1&&ch[i]!=' ')
		 {
			 word=word+ch[i];
			 i++;
		 }
		 System.out.println(word+"->"+word.length());
	 }
 }

}
