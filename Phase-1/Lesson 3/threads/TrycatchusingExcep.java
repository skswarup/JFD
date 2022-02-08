package com.simplilearn.threads;

public class TrycatchusingExcep {

	public static void main(String[] args) {
		char [] c= {'a','v','r','y'};
		try {
			c[5]='h';
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds!");
		}
		finally {
			System.out.println("The array is of size: "+c.length);
		}
	}

	}
