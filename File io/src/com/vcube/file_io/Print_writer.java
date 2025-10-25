package com.vcube.file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("C:\\Vcube\\File Test folder\\filethreepw.text",true);
		PrintWriter pw=new PrintWriter(f);
		pw.println("helo");
		pw.println("how are you guys doing ");
		pw.println("great ");
		pw.println(69);
		pw.flush();
		pw.close();
		f.close();
		
	}

}
