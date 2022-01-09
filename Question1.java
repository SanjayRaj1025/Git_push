package com.techno.challenges;

public class Question1 {

		public static String getDurationString(int mm, int ss) {
			int hh = 0;
			if (mm >= 0 && ss >= 0 && ss <= 59) {
				if (mm >= 60) {
					hh = mm / 60;
					mm = mm % 60;
					String s = hh + "hr " + mm + "min " + ss + "sec ";
					return s;
				} else {
					String s = hh + "hr " + mm + "min " + ss + "sec ";
					return s;
				}
			} else
				return "invalid value";
		}

		public static String getDurationString(int ss) {
			if (ss >= 0) {
				int mm=ss/60;
				ss=ss%60;
				String s = mm+"min " +ss + "sec";
				return s;
			} else
				return "invalid value";
		}

		public static void main(String[] args) {
	        System.out.println(getDurationString(50));
	        System.out.println(getDurationString(80, 50));
	        
		}

	}


