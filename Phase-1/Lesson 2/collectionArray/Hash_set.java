package com.simplilearn.collectionArray;
import java.util.HashSet;
import java.util.Scanner;

public class Hash_set {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		String name;
		char c;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter list name: ");
			while(true) {
			 name=sc.next();
				set.add(name);
				System.out.println("add name?(y/n) :");
				c=sc.next().charAt(0);
				if(c=='n'||c=='N') break;
			
			}
			set.add("Swar");
			
			System.out.println(set);
			
			System.out.println("Is Empty: "+set.isEmpty());
			
			set.remove("blow");
			
			System.out.println("Size: "+set.size());
	}
}
