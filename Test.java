package com.techno.exception;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int x=sc.nextInt();
		System.out.println("enter the second number");
		int y=sc.nextInt();
		try {
			try
			{
				int[] a=new int[3];
				a[2]=50;
			}
			catch(Exception e) {
				System.out.println("size exceeded");
			}
			
			int result=x/y;
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("denominator shouldn't be zero");
		}
	}

}
