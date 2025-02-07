package com.tka.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOExample1 {
	public static void main(String[] args) throws IOException {
//		File f=new File("sample.txt");
//		f.createNewFile();
		
		String s="good morning";
		
		FileWriter fw=new FileWriter(new File("sample.txt"));
		fw.write(s);
		fw.close();
		
	}

}

