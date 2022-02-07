package com.simplilearn.lesson2;

public class Method_Overloading {
	//creating methods with same name , same return type but different parameter length.
	public int add(int a , int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public float add(float a , float b) {
		return a+b;
	}
	public float add(float a , float b, float c) {
		return a+b+c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public double add(double a, double b ,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		//creating object and calling same methods with different argument types.
		Method_Overloading obj = new Method_Overloading();
		//calling integer type
		System.out.println(obj.add(20, 25));
		System.out.println(obj.add(25,852,54));
		
		//calling float type
		System.out.println(obj.add(52.3,51.8));
		System.out.println(obj.add(25.3,54.2,5.6));
		
		//calling double type
		System.out.println(obj.add(5.365,51.26));
		System.out.println(obj.add(23.54,65.321,56.20));	

	}
}
