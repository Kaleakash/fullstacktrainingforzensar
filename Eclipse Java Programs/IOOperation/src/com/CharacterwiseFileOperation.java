package com;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterwiseFileOperation {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("info.txt");
		FileWriter fw = new FileWriter("D:\\infodetails.txt");
	
		int ch;
		while((ch=fr.read()) != -1) {		// read data till end -1 EOF 
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copied...");
	}

}
