package com.techno.challenges;

public class Question8 {
	static int sumFirstAndLastDigit(int number) {
		if (number > 0) {
			int lastDigit = number % 10;
			int sum = 0;
			while (number > 0) {
				number = number / 10;
				if (number < 10) {
					int firstNumber = number;
					sum = lastDigit + firstNumber;
				}
			}
			return sum;
		}

		else
			return -1;
	}

	public static void main(String[] args) {
		int n = sumFirstAndLastDigit(2345);
		System.out.println(n);
	}

}
