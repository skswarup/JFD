package com.simplilearn.threads;

class MyException extends Exception{
	String str1;
	MyException(String str1){
	this.str1=str1;
	}
	public String toString() {
		return ("My Exception :"+str1);
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException("This is an error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	}

}

