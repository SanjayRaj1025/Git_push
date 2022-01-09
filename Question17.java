package com.techno.challenges;

public class Question17 {
	double height;
	double width;
	
	Question17(){
		
	}
	public Question17(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	static double  getHeight(double height) {
		if(height<0) {
			return 0;
		}
		return height;	
	}
	
	static double  getWidth(double Width) {
		if( Width<0) {
			return 0;
		}
		return Width;	
	}
	
	 double setHeight() {
		this.height = height;
		return height;
	}
	 double setWidth() {
		 this.width = width;
		 return width;
	 }
	 
	 double getArea() {
		 return getHeight(height)*getWidth(width);
	 }


	public static void main(String[] args) {
		Question17 q17 = new Question17(4,6);
		System.out.println(	q17.getArea());

	}


}
