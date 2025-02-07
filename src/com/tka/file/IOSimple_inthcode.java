package com.tka.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOSimple_inthcode {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("sample.txt");
		int d=0;
		char ch[]=new char[(int) new File("sample.txt").length()];
		
		for (int i = 0;(d=fr.read())!=-1; i++) {
			ch[i]=(char)d;
		}
		String res=new String(ch);
		System.out.println(res);
			
		}
		
	}


