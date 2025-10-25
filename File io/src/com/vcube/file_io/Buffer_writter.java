package com.vcube.file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_writter {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Vcube\\File Test folder\\filetwo.text",true);
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("hi");
		bw.newLine();
		bw.write("how are you doing");
		bw.newLine();
		bw.write("10");
		bw.write("bye");
		bw.flush();
	}
}
