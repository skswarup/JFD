package com.simplilearn.lesson2;
import java.util.Scanner;

public class Methods {
		
		public void display(){
			System.out.println("Welcome to SimpliLearn.");
		}
		//This will return integer type data.
		public int add(int a , int b) {
			return a+b;
		}
		//this will return true/false type data.
		public boolean valid(int age) {
			if(age > 18)
				return true;
			else return false;
		}
		//this will return string type data.
		public String name(String fname ,String lname) {
			return fname+" "+lname;
		}
		
		public static void main(String [] args) {
			
			//taking input from user and call the methods.
			
			Scanner sc = new Scanner(System.in);
			Methods m = new Methods();
			m.display();
			System.out.println("Enter two number to add : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result =m.add(a,b);
			System.out.println("a+b = "+ result);
			System.out.println("Enter your age : ");
			int c = sc.nextInt();
			System.out.println(m.valid(c));
			System.out.println("Enter your First name and Last name :");
			String s1 = sc.next();
			String s2 = sc.next();
			System.out.println("Your name is : "+ m.name(s1, s2));
		}
	}	

