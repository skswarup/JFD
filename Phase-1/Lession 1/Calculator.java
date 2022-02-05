package com.simplilearn.lvc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	

							//getting user input value
					Scanner sc=new Scanner(System.in);
					
					//Variable declaration
					double a,num1,num2,num3;
					char b;
					
					while(true) {

						//Getting User Operation
						
						System.out.println("1. (+) 2. (-)"+"\n3. (*) 4. (/)");
						System.out.println("Choose a Operation (1/2/3/4)");
						
					//getting user operation selection
					a=sc.nextInt();
					
					if(a==1) {
						System.out.println("you Choose Addition"+"\nEnter two numbers :");
						num1=sc.nextDouble();
						num2=sc.nextDouble();
						num3=num1+num2;
						System.out.println(num1+"+"+num2+" = " +num3);
					}
					else if(a==2) {
						System.out.println("You Choose Substraction"+"\nEnter two numbers :");
						num1=sc.nextDouble();
						num2=sc.nextDouble();
						num3=num1-num2;
						System.out.println(num1+"-"+num2+" = " +num3);
					}
					else if(a==3){
						System.out.println("You Choose Multiplication"+"\nEnter two numbers :");
						num1=sc.nextDouble();
						num2=sc.nextDouble();
						num3=num1*num2;
						System.out.println(num1+"*"+num2+" = " +num3);
					}
					else if(a==4) {
						System.out.println("You Choose Division"+"\nEnter two numbers :");
						num1=sc.nextDouble();
						num2=sc.nextDouble();
						num3=num1/num2;	
						System.out.println(num1+"/"+num2+" = " +num3);
					}
					
					//Either continue or exit
						System.out.println("Enter 'y' to Continue OR 'n' to exit .");
						b=sc.next().charAt(0);
						if(b=='y') continue;
						else break;
								
					
				}
			}

	}


