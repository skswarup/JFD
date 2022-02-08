package com.simplilearn.threads;

import java.util.Scanner;

public class FinallyKey {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        
	        try {
	            System.out.println("Enter Number");
	            String value= sc.nextLine();
	            int num=Integer.parseInt(value);
	            System.out.println("Enter Name");
	            String name=sc.nextLine();
	            
	            System.out.println("Id: "+num+" \n"+ "Name: "+name);    
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println(e);
	        }
	        finally
	        {
	            sc.close();
	            System.out.println("Scanner closed");
	        }
		}

}
