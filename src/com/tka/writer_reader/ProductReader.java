package com.tka.writer_reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ProductReader {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("target.txt");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ArrayList<Product>prolist=(ArrayList<Product>)ois.readObject();
		
		ois.close();
		fis.close();
		prolist.parallelStream().forEach(s->System.out.println(s));
		
	}

}
