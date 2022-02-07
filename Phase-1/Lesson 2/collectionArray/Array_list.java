package com.simplilearn.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		
		String name;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list name : ");
		while(true) {
			name=sc.next();
			list.add(name);
			System.out.println("Add Name ?(y/n) : ");
			c=sc.next().charAt(0);
			if(c=='n'|| c=='N') break;
			
		}
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.contains("scar"));
		System.out.println("Size: "+ list.size());
		
		list.add("prog");
		System.out.println("Size: "+ list.size());
		System.out.println("Element from index 2: "+list.get(2));
		
		for(String s:list) {
			System.out.println(s);
		}
	}

}
