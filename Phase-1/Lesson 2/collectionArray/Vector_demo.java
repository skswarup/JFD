package com.simplilearn.collectionArray;
import java.util.Scanner;
import java.util.Vector;

public class Vector_demo {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		String name;
		char c;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter list name: ");
			while(true) {
			 name=sc.next();
				vector.add(name);
				System.out.println("add name?(y/n) :");
				c=sc.next().charAt(0);
				if(c=='n'||c=='N') break;
			}

				System.out.println(vector.get(2));
				
				System.out.println("Size: "+vector.size());
				
				System.out.println(vector);
	}
}
