package com.tka.writer_reader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductTest {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Product>list=new ArrayList<Product>();
		
		list.add(new Product(222,"pen",50));
		list.add(new Product(999,"notebook",60));
		list.add(new Product(555,"machine",1000));
		list.add(new Product(45,"book",90));
		list.add(new Product(77,"notebook",80));
		list.add(new Product(44,"laptop",40));
		
		File f=new File("target.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.close();
		fos.close();
		System.out.println("Data is written on the disk..");
		
	}

}
