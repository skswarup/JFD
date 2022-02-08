package com.simplilearn.threads;
class Sender{
	public void send(String msg) {
		System.out.println("sending"+"\t"+msg+"...");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println(msg+" Sent Successfull");
	}
}
class MyThread1 extends Thread{
	Sender sender;
	private String msg;
	MyThread1(String msg,Sender s){
		this.msg=msg;
		sender=s;
	}
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}
}
public class Syncronization {
	public static void main(String[] args) {
		Sender snd=new Sender();
		MyThread1 m1=new MyThread1("Hello",snd);
		MyThread1 m2=new MyThread1("I'm scar",snd);
		
		m1.start();
		m2.start();
		try {
			m1.join();
			m2.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
