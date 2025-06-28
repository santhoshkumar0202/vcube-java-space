package com.vcube.errorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingCE {

	public static void main(String[] args) throws IOException,InterruptedException,FileNotFoundException {
		// TODO Auto-generated method stub

		//1.creating file obj from io, 2. call method createNewfile 3. create filereder obj(pass file obj) from io. filereader
		//4. r.read() it reads one alphabit per iteration or per call 
		
		try {
		File e = new File("c:\\Vcube\\max.txt");
			System.out.println(e);
			
			//while calling will get io exception CE;
			e.createNewFile();
			
			//file not found exception CE will occur here while creating obj
		FileReader r = new FileReader(e);
		int c = r.read();
			try {
		while (c != -1) {
			//while calling thread.sleep will araise interrrupted exception CE
			Thread.sleep(250);;
			System.out.print((char) c);
			c = r.read();
				}

			} catch (Exception e1) {
//			 TODO: handle exception
				e1.printStackTrace();

			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found block");
			e.printStackTrace();
		} catch (IOException b) {
			b.printStackTrace();
		}
	}

}
