package com.simplilearn.diamond;

public class TestClass implements Start,End {
	
	@Override
	public void show() {
		Start.super.show();
		End.super.show();
	
	}
	public static void main(String[] args) {
		TestClass t=new TestClass();
		t.show();
	}
}
