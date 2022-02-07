package com.simplilearn.inner;

public class MethodLocalInner {

		private String s="What is your name ?";
		public void display() {
			class Inner{
				void myMethod() {
					System.out.println(s+"\n I am Swarup.");
				}
			}
			Inner inner=new Inner();
			inner.myMethod();
		}
		public static void main(String[] args) {
			MethodLocalInner mlic=new MethodLocalInner();
			mlic.display();
		}
	
	}

