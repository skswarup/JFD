package com.simplilearn.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpression {

	public static void main(String[] args) {
		String pattern="([a-z0-9]+)@gmail.com";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher("papun408@gmail.com");
		System.out.println(m.matches());
		System.out.println(m.equals(m));
		
		String s = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p1 = Pattern.compile(s);
		Matcher c = p1.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );

	}


	}


