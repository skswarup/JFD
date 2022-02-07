package com.simplilearn.collectionArray;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
	public static void main(String[] args) {
		
	LinkedList<String> list=new LinkedList<String>();
	String name;
	char c;
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter list name: ");
		while(true) {
		 name=sc.next();
			list.add(name);
			System.out.println("add name?(y/n) :");
			c=sc.next().charAt(0);
			if(c=='n'||c=='N') break;
		
		}
		System.out.println("Size "+list.size());
		list.add("scar");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.add(2,"blow");
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}


