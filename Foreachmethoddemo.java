package com.techno.foreachmethodexample;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foreachmethoddemo {
	public static void main(String[] args) {
		
		List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("--------------from for loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i);
			
		}
		
		System.out.println("--------------from for each loop");
		for (Integer integer : arrayList) {
			System.out.println(integer);
			
		}
		
		System.out.println("--------------from iterator");
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("--------------from for each method");
		arrayList.forEach(System.out::println);
		
	}

}
