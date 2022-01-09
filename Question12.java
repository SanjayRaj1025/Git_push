package com.techno.challenges;

public class Question12 {
	static void printFactors(int number){
    	if(number>=1) {
    		for(int i=1;i<=number;i++) {
    			if(number%i==0) {
    				System.out.println(i);
    			}
    		}
    	}
    	else
    		System.out.println("invalid value");;
    }
    
    public static void main(String[] args) {
		printFactors(36);
	}

}
