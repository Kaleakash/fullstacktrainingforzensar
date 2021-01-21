package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseFileOperation {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos  = new FileOutputStream("abc.txt");
		System.out.println("Enter the data");
		int ch;
		while((ch=dis.read()) != '@') {
			System.out.println(ch +"="+(char)ch);
			fos.write(ch); 
		}
		fos.close();
		System.out.println("File created");
	}

}
