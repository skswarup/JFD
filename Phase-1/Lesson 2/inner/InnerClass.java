package com.simplilearn.inner;

public class InnerClass {
	private int a=101;
	class Inner {
		void display() {
			System.out.println("Welcome to Innre Class");
			System.out.println("Value of a: "+a);
		}
		
	}
	public static void main(String[] args) {
		InnerClass outer=new InnerClass();
		InnerClass.Inner inner=outer.new Inner();
		inner.display();

	}


}
