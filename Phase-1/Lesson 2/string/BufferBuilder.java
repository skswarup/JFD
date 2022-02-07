package com.simplilearn.string;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Welcome to Simplilearn");
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("S"));
		System.out.println(str.replace(11,22,"Organization"));
		
		StringBuilder str1=new StringBuilder("I am Swarup");
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("S"));
		System.out.println(str.replace(11,19,"Organization"));
	}

	}


