package com.simplilearn.collectionArray;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HasMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
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
		//Id are in ascending Order
		System.out.println(map);
		
		System.out.println(map.containsKey(101));
		
		System.out.println("get value of key 101: "+map.get(101));
		
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
