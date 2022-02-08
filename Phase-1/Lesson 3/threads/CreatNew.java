package com.simplilearn.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatNew {
	private static void createFileUsingFileClass() throws IOException {
		File file=new File("D://temp//testfile.txt");
		// Creating file :
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already exist");
		}
		
		//Writing Content :
		FileWriter writer=new FileWriter(file);
		writer.write("Hello \n\tWelcome to File test");
		writer.close();
	}
	public static void main(String[] args)throws IOException {
		createFileUsingFileClass();
	}
}
