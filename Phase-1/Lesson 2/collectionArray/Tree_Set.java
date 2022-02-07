package com.simplilearn.collectionArray;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("scar");
		set.add("blow");
		set.add(null);
		set.add("java");
		
		System.out.println(set);
		System.out.println("Is Empty: "+set.isEmpty());
		
		set.remove("blow");
		System.out.println("Size: "+set.size());
	}
}
