package com.simplilearn.collectionArray;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linked_Hashset {
	public static void main(String[] args) {
	
		LinkedHashSet<String> set=new LinkedHashSet<String>();
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
			//no order maintain
			System.out.println(set);
			//no duplicates allowed
			set.add("scar");
			
			System.out.println(set);
			System.out.println("Is Empty: "+set.isEmpty());
			
			set.remove("blow");
			
			System.out.println("Size: "+set.size());
			set.add(null);
			System.out.println(set);
	}

}
