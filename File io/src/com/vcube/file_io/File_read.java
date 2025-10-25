package com.vcube.file_io;

import java.io.FileReader;
import java.io.IOException;

public class File_read {
public static void main(String[] args) throws IOException {
	
	FileReader f=new FileReader("C:\\Vcube\\File Test folder\\fileone.text");
	int i =f.read();
	while(i!=-1) {
		
		System.out.print((char)i);
		 i =f.read();
	}
	
	f.close();
}
}
