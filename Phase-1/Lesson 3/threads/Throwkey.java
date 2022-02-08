package com.simplilearn.threads;

import java.util.Scanner;

public class Throwkey {
	void check(int age) {
		try {
		if (age<18)
			throw new ArithmeticException("You are not eligible for vote !");
		else
			System.out.println("Result :Congratulation.. \n\tYou are eligible for vote !");
		}
		catch(ArithmeticException e) {
			System.out.println("Result : "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		Throwkey thr=new Throwkey();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
			thr.check(age);
		
		}
}
