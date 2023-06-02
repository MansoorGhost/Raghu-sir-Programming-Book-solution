package org.stringjsp;
import java.util.Iterator;
import java.util.Scanner;
public class Balancedbreaket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.next();
		char[] ch=st.toCharArray();
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
		for (int i = 0; i < st.length(); i++)
		{
		if(i==0 && ch[i]!=')'|| ch[i]!='}'||ch[i]!=']')
			{
					if(ch[i]=='(')
						c1++;
					else if(ch[i]==')')
						c2++;
					else if(ch[i]=='{')
						c3++;
					else if(ch[i]=='}')
						c4++;
					else if(ch[i]=='[')
						c5++;
					else if(ch[i]==']')
						c6++;
				}
		else
			System.out.println("Invalid");
			break;
			}	
		if(c1==c2 && c3==c4 && c5==c6)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}