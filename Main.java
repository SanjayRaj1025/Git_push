package com.techno.threadclasswithrunnable;

public class Main {
	public static void main(String[] args) {
		Runnable myThread=new Mythread();
		Thread currentThread=Thread.currentThread();
		System.out.println("The name fo the current thread is:"+Thread.currentThread().getName());
		
		//code to set the name for the thread
		
		currentThread.setName("chota bheem");
		System.out.println("The name of the thread is:"+Thread.currentThread().getName());
		Thread thread=new Thread(myThread);
		thread.setName("Chutki");
		thread.start();
		
		//code to get id
		
		System.out.println("the thread id is:"+currentThread.getId());
		
		
		
	}

}
