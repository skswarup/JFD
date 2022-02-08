package com.simplilearn.inheritance;

class Animal {

	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	  
	}

	
class Dog extends Animal {

	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

public class Main {
	  public static void main(String[] args) {

	    Dog labrador = new Dog();

	    
	    labrador.name = "scar";
	    labrador.display();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();

	  }
	}












