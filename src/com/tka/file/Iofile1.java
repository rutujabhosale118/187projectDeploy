package com.tka.file;

import java.io.File;
import java.io.IOException;

public class Iofile1 {
	public static void main(String[] args) throws IOException {
		File f=new File("good.txt");
		f.createNewFile();
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println("absulatepath:"+f.getAbsolutePath());
		//f.mkdir();
		//f.delete();
		f.isDirectory();
		//System.out.println("parentfile:"+f.getParentFile());
		System.out.println("directories:"+f.isDirectory());
		System.out.println("filesize:"+f.length());
		System.out.println("-------bye-----");
		
	}

}

