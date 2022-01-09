package com.techno.challenges;

import java.util.Scanner;

public class Question10 {
	public boolean hasSharedDigit(int x, int y) {
		int firstnumberfirstdigit = x / 10;
		int firstnumberlastdigit = x % 10;
		int secondnumberfirstdigit = y / 10;
		int secondnumberlastdigit = y % 10;
		boolean result=true;
		
		if (x < 10 || x > 99 || y < 10 || y > 99) {
			result=false;
		} 
			
		else if (firstnumberfirstdigit == secondnumberfirstdigit || firstnumberfirstdigit == secondnumberlastdigit
					|| firstnumberlastdigit == secondnumberlastdigit) {
			result=true;
			}
			else {
				result=false;
			}
		return result;

		}

	

	public static void main(String[] args) {
		Question10 q10 = new Question10();
		System.out.println(q10.hasSharedDigit(21,78));
	}
}

