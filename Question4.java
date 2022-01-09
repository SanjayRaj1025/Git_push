package com.techno.challenges;

public class Question4 {

	public boolean isCatPlaying(String summer, int temp) {
		if (summer == summer && temp >= 25 && temp <= 45) {
			return true;
		} else if (summer != summer && temp >= 25 && temp <= 35) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Question4 q4 = new Question4();
		System.out.println(q4.isCatPlaying("winter", 44));
	}

}
