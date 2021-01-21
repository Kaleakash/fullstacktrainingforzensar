package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseFileOperation1 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\Innoserv Online Training\\Java New Training Notes\\fullstacktrainingforzensar\\Java Programs\\ExpDemo.java");
		BufferedInputStream bis = new BufferedInputStream(fis);		// connect to buffer 
		FileOutputStream fos = new FileOutputStream("info.doc");
		BufferedOutputStream bos  = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read()) != -1){					//'a' or '@' EOF in java -1 is consider as EOF 
				bos.write(ch);
		}
		bos.flush(); 
		fis.close();
		fos.close();
		System.out.println("File copied...");
	}

}
