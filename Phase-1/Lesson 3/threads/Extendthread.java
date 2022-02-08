package com.simplilearn.threads;

class MyThread extends Thread{
	public void run() {
		System.out.println("My thread starts running.");
	}
}
public class Extendthread {
	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
	}
}
