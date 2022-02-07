package com.simplilearn.lesson2;

public class Constructor {
		int id;
		String name;
		String Dept;
		public Constructor() {
			id=301;
			name="swar";
			Dept="junior Eng.";
		}
		public Constructor(int id,String name,String Dept) {
			this.id=id;
			this.name=name;
			this.Dept=Dept;
		}
		public static void main(String[] args) {
			Constructor obj =new Constructor();
			System.out.println("User 1");
			System.out.println("id: "+obj.id);
			System.out.println("name: "+obj.name);
			System.out.println("Dept: "+obj.Dept);
			
			Constructor obj1=new Constructor(101,"scar","Developer");
			System.out.println("\nUser 2");
			System.out.println("id: "+obj1.id);
			System.out.println("name: "+obj1.name);
			System.out.println("Dept: "+obj1.Dept);
			
		}

}
