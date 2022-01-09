package com.techno.mock;
import java.util.Scanner;
public class RemoveDuplicateString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					repeated=true;
					break;
				}
			}
			
			if(!repeated) {
				System.out.println(a[i]);
			}
			
		}
		
	}

}
