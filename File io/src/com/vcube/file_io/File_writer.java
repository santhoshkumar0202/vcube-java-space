package com.vcube.file_io;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Vcube\\File Test folder\\fileone.text",true);
            f.write("hi !!");
            f.write("\n");
            f.write("how are you doing");
            f.write("\n");
            f.write(10);
            f.write("thank you for coming");
		
            f.flush();
           
            f.close();
	}
}
