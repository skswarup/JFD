package com.simplilearn.collectionArray;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Tree_map {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		String name;
		int id;
		char c;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter ID");
		id=sc.nextInt();
		System.out.println("Enter name: ");
		name=sc.next();
		map.put(id,name);
		System.out.println("add name?(y/n) :");
		c=sc.next().charAt(0);
		if(c=='n'||c=='N') break;
	
	}
		System.out.println(map);
		
		System.out.println(map.containsKey(2));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
