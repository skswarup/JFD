package com.classobject;

public class Cat {
	 String name; 
	    String breed; 
	    int age; 
	    String color; 
	    Cat(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("My name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
	    } 
	
	    public static void main(String[] args) 
	    { 
	        Cat scott = new Cat("kunn","Himalayan", 4, " White"); 
	        System.out.println(scott.toString()); 
	    }

}
