package com.simplilearn.collectionArray;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;

public class Has_Table {
	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		String name;
		int id;
		char c;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter list name: ");
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
		//id representing in descending order and name is not maintaining the order
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		
		System.out.println("get value of key 2: "+map.get(2));
		
		for(Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
