package com.simplilearn.annoyinner;

public class UseAnnyoTest {
	public static void main(String[] args) {
		
		Bike b=new Bike() {

			@Override
			public void start() {
			
				System.out.println("Bike Start");
				
			}

			@Override
			public void stop() {
				System.out.println("Bike stop");
			}
			
		};
		b.start();
		b.stop();
		
	}

}
