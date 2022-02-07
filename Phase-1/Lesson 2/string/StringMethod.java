package com.simplilearn.string;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str =new String(" Welcome to Organization ");
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("S"));
		System.out.println(str.replace("Organization","HelloWorld"));
		System.out.println(str.trim());
		
		System.out.println(str.equals("     Welcome to Organization      "));
		System.out.println(str.stripLeading().length());
		System.out.println(str.trim().length());
	}


	}


