package com.tka.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Wrtite :OutputStream
//Read :InPutStream.
//char :CharoutputStream  ,charinputstream.

public class IOExample {
	public static void main(String[] args) throws IOException {
		
//		for (int i = 0; i <5; i++) {
//			new File("target"+i+".txt").createNewFile();
//			
//		}
		
		//Question :write a IOWritten stream
		
		File f=new File("sample.txt");
		String s="Good Morning";
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(s.getBytes());
		System.out.println("Data is written on the disk....");
		fos.close();
		
		//Question : write a IOReader stream..
		
		FileInputStream fis=new FileInputStream(f);
		byte[]b=fis.readAllBytes();
		String s1=new String(b);
		System.out.println(s1);
	}

}
