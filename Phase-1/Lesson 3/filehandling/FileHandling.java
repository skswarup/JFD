package com.simplilearn.filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileHandling {
	 public static void main(String[] args) throws IOException {
		  Scanner sc=new Scanner (System.in);
		  System.out.println("___Welcome to File World___");
		  System.out.println("Enter file name :");
		  String fileName=sc.nextLine();
		  while(true) {
		 
		  System.out.println("Choose operation (1,2,3)? :\n1. Read\n2. Write\n3. Append");
		  int a=sc.nextInt();
		  sc.nextLine();
		  if(a==1) {
			  List<String> lines = Collections.emptyList(); 
			    try
			    { 
			      lines = 
			       Files.readAllLines(Paths.get("D:\\temp\\"+fileName), StandardCharsets.UTF_8);
			      List l=lines;
				    Iterator<String> itr = l.iterator(); 
				    while (itr.hasNext()) 
				      System.out.println(itr.next()); 
			    } 
			    catch (IOException e) 
			    { 
			      System.out.println(e);
			    } 
			    
		  }
		  else if(a==2) {
			  System.out.print("Enter your Text :");
			  String st=sc.nextLine();			
		           
			     FileWriter fw = new FileWriter("D:\\temp\\"+fileName);	       		           	  		           		  		           		           	  		           		            		  		         
			     fw.write(st);		  		           
			     fw.close();		  		          
			     System.out.println("File  writing  done");
			     
		  }
		  else if(a==3) {
			  System.out.println("Enter content :");
			  String str=sc.nextLine();
			  
			  File f=new File("D:\\temp\\"+fileName);     
		      FileWriter fw=new FileWriter(f,true);  
		      fw.append(str);  
		      fw.flush();          
		      fw.close();
			    System.out.println("Append  content Successfully");    
		  }
		  System.out.println("Repeat again?(y/n) :");
			char c=sc.next().charAt(0);
			if(c=='y'||c=='Y') continue;
			else
				System.out.println("...Thank you...");
			break;
		  	}
	  	}	
}
