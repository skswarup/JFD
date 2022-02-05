package com.simplilearn.AccessSpecifier;

class DefSpecifier{
	void display() {
		System.out.println("This is defalut access specifier");
	}
	
	//2. using private access specifiers
    private	void test() {
    	System.out.println("This is private access specifier");
    }
    
    //3. using protected access specifiers
    protected void hello() {
    	System.out.println("This is protected access specifier");
    }
    
    //4. using public access specifiers
    public void world() {
    	System.out.println("This is Public Access Specifiers");
    }
}

public class AccessSpecifier {
	public static void main(String[] args) {
		System.out.println("Within package and other class :\n");
		
		DefSpecifier obj=new DefSpecifier();
		obj.display();
		
		//obj.test(); //can't access
		
		obj.hello();
		obj.world();
		
		System.out.println("\nWithin package and same class :\n");
		AccessSpecifier obj2=new AccessSpecifier();
		obj2.display1();
		obj2.test1();
		obj2.hello1();
		obj2.world1();
	}	
		
		//Using default access specifier
		void display1() {
			System.out.println("This is default Access specifier.");
		}
		//using private access specifier
		private void test1() {
			System.out.println("This is private access specifier.");
		}
		//Using protected Access specifier
		protected void hello1() {
			System.out.println("This is a protected access specifier.");
		}
		//Using public access specifier
		public void world1() {
			System.out.println("This is public access specifier.");
		}
		
		
	}


