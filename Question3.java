package com.techno.challenges;

public class Question3 {

	static public void printEqual(int x, int y, int z) {
		if (x < 0 || y < 0 || z < 0) {
			System.out.println("invalid value");
		} else if (x == y && y == z) {
			System.out.println("All number are equal");
		} else if (x != y && y != z && z != x) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Neither all are equal or different");
		}
	}

	public static void main(String[] args) {
		printEqual(30, 20, 20);
	}

}
