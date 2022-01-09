package com.techno.arrays;
import java.util.Scanner;

public class add {
	static int result;
	public void addition(int a) {
		result=result+a;
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		add add1 = new add();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			add1.addition(a[i]);
			
		}
		sc.close();
		
	}

}
