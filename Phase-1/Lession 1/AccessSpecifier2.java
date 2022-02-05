package com.AccessSpecifier2;

import com.simplilearn.AccessSpecifier.AccessSpecifier;

public class AccessSpecifier2 {

	public static void main(String[] args) {
		AccessSpecifier obj3=new AccessSpecifier();
		//obj3.display1();  //cat't access in out side package
		//obj3.test1();     //cat't access in out side package
		//obj3.hello1();    //cat't access in out side package
		obj3.world1(); //public access specifier in out side package
	}

}
