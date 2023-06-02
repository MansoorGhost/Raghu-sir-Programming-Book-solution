package org.stringjsp;

import java.util.Scanner;

public class Array 
{
	static int sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int n=sc.nextInt();
		int[] ar=new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(sum(ar[i])) ;
		}
	}
}
