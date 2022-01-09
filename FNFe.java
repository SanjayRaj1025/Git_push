package com.techno.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class FNFe {
	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("F:\\sample");
		}catch(Exception e){
			System.out.println("exception handled");
			
		}
	}

}
