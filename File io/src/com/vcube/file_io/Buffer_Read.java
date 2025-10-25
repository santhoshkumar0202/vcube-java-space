package com.vcube.file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("C:\\Vcube\\File Test folder\\fileone.text");
		
		BufferedReader read=new BufferedReader(f);
		
		String s=read.readLine();
		while(s!=null) {
			
			System.out.println(s);
			s=read.readLine();
		}
		read.close();
		f.close();

	}

}
