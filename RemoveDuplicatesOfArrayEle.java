package com.techno.mock;

import java.util.Scanner;

public class RemoveDuplicatesOfArrayEle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int len = a.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					a[j] = a[len - 1];
					len--;
				}
			}
		}

		System.out.println("new array");
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}
	}

}
