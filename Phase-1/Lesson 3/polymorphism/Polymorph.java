package com.polymorphism;

public class Polymorph {
	
	 public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Polymorph s = new Polymorph(); 
	        System.out.println(s.sum(101, 210)); 
	        System.out.println(s.sum(101, 201, 301)); 
	        System.out.println(s.sum(110.5, 201.5)); 
	    
	    }
}
