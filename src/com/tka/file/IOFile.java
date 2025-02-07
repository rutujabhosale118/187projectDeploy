package com.tka.file;

import java.io.File;
import java.io.IOException;

public class IOFile {
	public static void main(String[] args) throws IOException {

		File f=new File("greeting.txt");
		f.createNewFile();
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println("absulate path:"+f.getAbsolutePath());
		//f.delete();                         //methods..
		//f.mkdir();
		//f.isDirectory();
		//System.out.println("parentfile"+f.getParentFile());
		System.out.println("directory"+f.isDirectory());
		System.out.println("Filesize"+f.length());
		System.out.println("--------Bye Bye-------");
		
		
	}
}
