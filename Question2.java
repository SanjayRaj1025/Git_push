package com.techno.challenges;

public class Question2 {
	public double area(double rad) {
		if (rad >= 0) {
			double area = 3.14 * rad * rad;
			return area;
		} else
			return -1.0;
	}

	public double area(double x, double y) {
		if (x >= 0 && y >= 0) {
			double area = x * y;
			return area;
		} else
			return -1.0;
	}

	public static void main(String[] args) {
		Question2 q2 = new Question2();
		System.out.println(q2.area(4.5));
		System.out.println(q2.area(20, 10.80));
	}

}
