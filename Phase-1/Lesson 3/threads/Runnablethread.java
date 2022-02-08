package com.simplilearn.threads;

class MyRunnableThread implements Runnable{
	public void run() {
		System.out.println("MyRunnable Thread starts Running");
	}	
}
public class Runnablethread {

	public static void main(String[] args) {
		MyRunnableThread m=new MyRunnableThread();
		Thread t=new Thread(m);
		t.start();
	}
}
